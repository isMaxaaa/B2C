package com.max.b2c.controller;

import com.alibaba.fastjson.JSONObject;
import com.max.b2c.common.util.JedisUtil;
import com.max.b2c.component.JwtUtil;
import com.max.b2c.mapper.UserLoginMapper;
import com.max.b2c.model.UserAddr;
import com.max.b2c.model.UserInfo;
import com.max.b2c.model.UserLogin;
import com.max.b2c.service.UserInfoService;

import com.max.b2c.common.JsonXMLUtils;
import com.max.b2c.common.ServerResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("user")
@Api(value = "测试用户相关的信息")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @CrossOrigin
    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ApiOperation(value = "用户注册",notes = "数据经验证后提交")
    public ServerResponse register(@RequestBody Map<String,Object> map) {
        try {
            UserLogin userLogin = JsonXMLUtils.map2object((Map<String, Object>) map.get("user_login"), UserLogin.class);
            UserInfo userInfo = JsonXMLUtils.map2object((Map<String, Object>) map.get("user_info"), UserInfo.class);
            return userInfoService.registerUserInfo(userInfo,userLogin);
        }catch (Exception e)
        {
            String error=e.getMessage();
            return ServerResponse.createByErrorMessage(error);
        }
    }

    @CrossOrigin(allowCredentials="true")
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登录",notes="用户登录")
    public ServerResponse login(@RequestBody String jsonparm, ServletRequest request,HttpServletResponse response)  {
        JSONObject objectjson = null;
        try {
            objectjson = JsonXMLUtils.objectjson(jsonparm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String logintype = (String) objectjson.get("logintype");
        String password = (String) objectjson.get("password");
        return userInfoService.userLogin(logintype,password,response);
    }

    @CrossOrigin(allowCredentials="true")
    @RequestMapping(value = "unauthorize",method = RequestMethod.GET)
    @ApiOperation(value = "未认证跳转",notes = "未认证跳转")
    public ServerResponse unauthorize(HttpServletRequest request, HttpServletResponse response){
//        response.setHeader("Access-Control-Allow-Origin", "*");
//       response.setHeader("Cache-Control","no-cache");

        return ServerResponse.createByErrorMessage("未认证");
    }

    @CrossOrigin(allowCredentials="true")
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    @ApiOperation(value = "用户注销",notes = "用户注销")
    public ServerResponse logout(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        String account = JwtUtil.getClaim(token, "account");
        JedisUtil.delKey("shiro:refresh_token:" + account);
        return ServerResponse.createBySuccessMessage("用户已下线");
    }



    @RequestMapping(value = "address",method = RequestMethod.POST)
    @ApiOperation(value = "用户添加地址",notes = "用户添加地址")
    @ApiImplicitParam(name = "useraddress",value = "用户地址",required = true,paramType = "body")
    public ServerResponse regiteraddress(@RequestBody UserAddr userAddress){
        return userInfoService.addUserAddrInfo(userAddress);
    }

    @RequestMapping(value = "address",method = RequestMethod.DELETE)
    @ApiOperation(value = "用户删除地址",notes = "用户删除地址")
    @ApiImplicitParam(name = "addrid",value = "用户地址id",required = true,paramType = "query",dataType = "Integer")
    public ServerResponse deleteaddress(@RequestParam("addrid") int addrid){
        return userInfoService.deleteUserAddrInfo(addrid);
    }

    @RequestMapping(value = "address",method = RequestMethod.GET)
    @ApiOperation(value = "查询用户地址",notes = "查询用户地址")
    public ServerResponse addresslist(HttpServletRequest request)
    {
        return userInfoService.selectAddr_detail(request);
    }

    @RequestMapping(value = "baseinfo",method = RequestMethod.GET)
    @ApiOperation(value = "个人基础信息设置",notes = "个人基础信息设置")
    public ServerResponse baseinfo(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        Integer userid = JwtUtil.getClaim(token);
        return userInfoService.selectUserInfo(userid);
    }

    @RequestMapping(value = "securityinfo",method = RequestMethod.GET)
    @ApiOperation(value = "个人账户安全设置",notes = "个人账户安全设置")
    public ServerResponse securityinfo(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        Integer userid = JwtUtil.getClaim(token);
        return userInfoService.securityinfo(userid);
    }

    @RequestMapping(value = "passwordset",method = RequestMethod.POST)
    @ApiOperation(value = "密码修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldpassword",value = "旧密码",required = true,paramType = "body"),
            @ApiImplicitParam(name = "newpassword",value = "新密码",required = true,paramType = "body")
    })
    public ServerResponse passwordset(@RequestBody String jsonparam,HttpServletRequest request)  {
        JSONObject objectjson = null;
        try {
            objectjson = JsonXMLUtils.objectjson(jsonparam);
        } catch (Exception e) {
            return ServerResponse.createByIllegalMessage();
        }
        String oldpassword = (String)objectjson.get("oldpassword");
        String newpassword = (String)objectjson.get("newpassword");
        String token = request.getHeader("Authorization");
        Integer userid = JwtUtil.getClaim(token);
        return userInfoService.passwordreset(userid,oldpassword,newpassword);
    }

    @RequestMapping(value = "emailset",method = RequestMethod.POST)
    @ApiOperation(value = "邮箱修改")
    @ApiImplicitParam(name = "newemail",value = "新的邮箱",required = true,paramType = "body")
    public ServerResponse emailset(@RequestBody String jsonparam, HttpServletRequest request){
        JSONObject objectjson = null;
        try {
            objectjson = JsonXMLUtils.objectjson(jsonparam);
        } catch (Exception e) {
            return ServerResponse.createByIllegalMessage();
        }
        String newemail = (String)objectjson.get("newemail");
        String token = request.getHeader("Authorization");
        Integer userid = JwtUtil.getClaim(token);
        return userInfoService.updateUserEmail(userid,newemail);
    }



}
