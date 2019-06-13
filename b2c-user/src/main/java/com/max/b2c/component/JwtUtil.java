package com.max.b2c.component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.max.b2c.common.util.Base64ConvertUtil;
import com.max.b2c.exception.CustomException;
import com.max.b2c.mapper.UserLoginMapper;
import com.max.b2c.model.UserLogin;
import com.max.b2c.model.UserLoginExample;

import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

@Component
public class JwtUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtUtil.class);


    private static UserLoginMapper userLoginMapper;
    @Autowired
    public  void setUserLoginMapper(UserLoginMapper userLoginMapper) {
        JwtUtil.userLoginMapper = userLoginMapper;
    }
    public  UserLoginMapper getUserLoginMapper() {
        return userLoginMapper;
    }






    /**
     * token过期时间
     */
    private static String accessTokenExpireTime;

    /**
     * jwt认证加密私钥
     */
    private static String encrpyJWTkey;

    @Value("${accessTokenExpireTime}")
    public void setAccessTokenExpireTime(String accessTokenExpireTime) {
        JwtUtil.accessTokenExpireTime = accessTokenExpireTime;
    }

    @Value("${encryptJWTKey}")
    public void setEncrpyJWTkey(String encrpyJWTkey) {
        JwtUtil.encrpyJWTkey = encrpyJWTkey;
    }

    /**
     * 检验token是否正确
     *
     * @param token
     * @return
     */
    public static boolean verify(String token) {
        try {
            // 帐号加JWT私钥解密
            String secret = getClaim(token, "account") + Base64ConvertUtil.decode(encrpyJWTkey);
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch ( AuthenticationException e) {
            LOGGER.error("JWTToken认证解密出现UnsupportedEncodingException异常:" + e.getMessage());
            throw new CustomException("JWTToken认证解密出现UnsupportedEncodingException异常:" + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("JWTToken认证解密出现UnsupportedEncodingException异常:" + e.getMessage());
            throw new CustomException("JWTToken认证解密出现UnsupportedEncodingException异常:" + e.getMessage());
        }
    }

    /**
     * 生成token
     *
     * @param token
     * @param account
     * @return
     * @throws Exception
     */
    public static String getClaim(String token, String account)  {
        try {
            DecodedJWT jwt = JWT.decode(token);
            // 只能输出String类型，如果是其他类型返回null
            return jwt.getClaim(account).asString();
        } catch (JWTDecodeException e) {
            LOGGER.error("解密Token中的公共信息出现JWTDecodeException异常:" + e.getMessage());
            throw new CustomException("解密Token中的公共信息出现JWTDecodeException异常:" + e.getMessage());
        }
    }

    public static Integer getClaim(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            Claim userid = jwt.getClaim("userid");
            return userid.asInt();
        } catch (JWTDecodeException e) {
            LOGGER.error("解密Token中的userid出现JWTDecodeException异常:" + e.getMessage());
            throw new CustomException("解密Token中的公共信息出现JWTDecodeException异常:" + e.getMessage());
        }
    }

    /**
     * 生成签名
     *
     * @param account
     * @param currentTimeMillis
     * @return
     */
    public static String sign(String account, String currentTimeMillis) {
        try {
            UserLoginExample userLoginExample = new UserLoginExample();
            userLoginExample.createCriteria().andUser_emailEqualTo(account);
            List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
            UserLogin userLogin = userLogins.get(0);
            int userid=userLogin.getUser_id();
            // 帐号加JWT私钥加密
            String secret = account + Base64ConvertUtil.decode(encrpyJWTkey);
            // 此处过期时间是以毫秒为单位，所以乘以1000
            Date date = new Date(System.currentTimeMillis() + Long.parseLong(accessTokenExpireTime) * 1000);
            Algorithm algorithm = Algorithm.HMAC256(secret);
            // 附带account帐号信息及自定义的数据
            return JWT.create()
                    .withClaim("account", account)
                    .withClaim("userid",userid)
                    .withClaim("currentTimeMillis", currentTimeMillis)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("JWTToken加密出现UnsupportedEncodingException异常:" + e.getMessage());
            throw new CustomException("JWTToken加密出现UnsupportedEncodingException异常:" + e.getMessage());
        }

    }
}

