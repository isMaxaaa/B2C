package com.max.b2c.service.serviceImpl;
import com.max.b2c.common.util.JedisUtil;
import com.max.b2c.component.JwtUtil;
import com.max.b2c.mapper.UserInfoMapper;
import com.max.b2c.mapper.UserAddrMapper;
import com.max.b2c.mapper.UserLoginMapper;
import com.max.b2c.model.*;
import com.max.b2c.service.UserInfoService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import com.max.b2c.common.ServerResponse;

@Service
@PropertySource("classpath:config.properties")
public class UserInfoServiceImpl implements UserInfoService {

    @Value("${refreshTokenExpireTime}")
    private String refreshTokenExpireTime;


    @Autowired(required=false)
    UserAddrMapper userAddrMapper;

    @Autowired(required=false)
    UserInfoMapper userInfoMapper;

    @Autowired(required=false)
    UserLoginMapper userLoginMapper;


    @Override
    public ServerResponse registerUserInfo(UserInfo userInfo, UserLogin userLogin) {
        //int j = userDao.addUserLoginInfo(userLogin);

        int j = userLoginMapper.insertSelective(userLogin);
        if(j!=1)
            return ServerResponse.createByErrorMessage("注册失败，请重试");
        userInfo.setUser_id(userLogin.getUser_id());
        int i = userInfoMapper.insertSelective(userInfo);
        if(i!=1)
            return ServerResponse.createByErrorMessage("注册失败，请重试");
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    @Override
    public ServerResponse userLogin(String logintype, String password, HttpServletResponse response) {
//        Subject subject = SecurityUtils.getSubject();
//
//        UsernamePasswordToken token=new UsernamePasswordToken(logintype,password);
//        try{
//            subject.login(token);
//            UserLoginExample userLoginExample = new UserLoginExample();
//            userLoginExample.createCriteria().andUser_emailEqualTo(logintype);
//            List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
//            httpSession.setAttribute("userinfo",userLogins.get(0));
//
//        }catch (AccountException e)
//        {
//            return ServerResponse.createByErrorMessage(e.getMessage());
//        }
//
//        return ServerResponse.createBySuccessMessage("登录成功");

        UserLoginExample userLoginExample = new UserLoginExample();
        userLoginExample.createCriteria().andUser_emailEqualTo(logintype);
        List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
        UserLogin userLogin=userLogins.get(0);
        if(userLogin==null)
            return ServerResponse.createByErrorMessage("账号不存在");
        else if(userLogin.getUser_password().equals(password))
        {
            String currentTimeMillis = String.valueOf(System.currentTimeMillis());
            JedisUtil.setObject("shiro:refresh_token:" + logintype,currentTimeMillis, Integer.parseInt("1800"));
            // 从Header中Authorization返回AccessToken，时间戳为当前时间戳
            String token = JwtUtil.sign(logintype, currentTimeMillis);
            response.setHeader("Authorization", token);
            response.setHeader("Access-Control-Expose-Headers", "Authorization");
            return ServerResponse.createBySuccessMessage("登录成功");
        }
        return ServerResponse.createByErrorMessage("密码或账号错误");

    }


    @Override
    public ServerResponse logout() {
//        Subject subject = SecurityUtils.getSubject();
//        UserLogin userinfo = (UserLogin) httpSession.getAttribute("userinfo");
//        httpSession.removeAttribute("userinfo");
//        //在shiro删除当前jsessionid之前，把session中用户信息除去
//        subject.logout();
//        int userid=userinfo.getUser_id();
//        UserLogin userLogin=new UserLogin();
//        userLogin.setLogging_ip(0);
//        userLogin.setUser_id(userid);
//        Short aShort =1 ;
//        userLogin.setIs_logged(aShort);
//        userLoginMapper.updateByPrimaryKeySelective(userLogin);
//        return ServerResponse.createBySuccessMessage("用户已下线");


        return null;
    }

    @Override
    public ServerResponse updateUserEmail(int userid, String newemail) {

        UserLogin userLogin = new UserLogin();
        userLogin.setUser_id(userid);
        userLogin.setUser_email(newemail);
        int i = userLoginMapper.updateByPrimaryKeySelective(userLogin);
        if(i<1)
            return ServerResponse.createByErrorMessage("修改失败");
        return ServerResponse.createBySuccessMessage("修改成功");
    }

    @Override
    public ServerResponse securityinfo(Integer userid) {
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(userid);
        return ServerResponse.createBySuccess(userLogin);

    }


    @Override
    public ServerResponse addUserAddrInfo(UserAddr userAddr) {
        int i = userAddrMapper.insertSelective(userAddr);
        if(i==1)
            return ServerResponse.createBySuccessMessage("添加成功");
        else
            return ServerResponse.createByErrorMessage("添加失败");

    }

    @Override
    public ServerResponse deleteUserAddrInfo(int addr_infoid) {
        int i = userAddrMapper.deleteByPrimaryKey(addr_infoid);
        if(i==1)
            return ServerResponse.createBySuccessMessage("删除成功");
        else
            return ServerResponse.createByErrorMessage("删除失败");
    }

    @Override
    public ServerResponse<List<UserAddr>> selectAddr_detail(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        Integer userid = JwtUtil.getClaim(token);
//        String account = JwtUtil.getClaim(token, "account");
//        UserLoginExample userLoginExample = new UserLoginExample();
//        userLoginExample.createCriteria().andUser_emailEqualTo(account);
//        List<UserLogin> userLogins = userLoginMapper.selectByExample(userLoginExample);
//        UserLogin userLogin = userLogins.get(0);

 //       int user_id=Integer.valueOf(userid);
        UserAddrExample userAddrExample = new UserAddrExample();
        userAddrExample.createCriteria().andUser_idEqualTo(userid);
        List<UserAddr> userAddrs = userAddrMapper.selectByExample(userAddrExample);
        if(userAddrs!=null)
            return ServerResponse.createBySuccess(userAddrs);
        return ServerResponse.createByErrorMessage("添加地址");
    }

    @Override
    public UserAddr updateAddr_detail(UserAddr userAddress) {
        return null;
    }

    @Override
    public ServerResponse selectUserInfo(int userid) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUser_idEqualTo(userid);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        if(userInfos.size()>0) {
            UserInfo userInfo=userInfos.get(0);
            return ServerResponse.createBySuccess(userInfo);
        }
        return ServerResponse.createByError();
    }

    @Override
    public ServerResponse passwordreset(int userid, String oldpassword, String newpassword) {
        UserLoginExample userLoginExample = new UserLoginExample();
        userLoginExample.createCriteria().andUser_passwordEqualTo(oldpassword).andUser_idEqualTo(userid);
        long l = userLoginMapper.countByExample(userLoginExample);
        if(l<1)
            return ServerResponse.createByErrorMessage("原密码错误");
        UserLogin userLogin = new UserLogin();
        userLogin.setUser_id(userid);
        userLogin.setUser_password(newpassword);
        userLoginMapper.updateByPrimaryKeySelective(userLogin);
        return ServerResponse.createBySuccessMessage("密码修改成功");

    }

    @Override
    public int updateUsername(String username, int userid) {
        return 0;
    }

    @Override
    public int updateUsergender(int gender, int userid) {
        return 0;
    }

    @Override
    public int updateUserAvatar(String avatar, int userid) {
        return 0;
    }


}
