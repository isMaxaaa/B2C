package com.max.b2c.service;


import com.max.b2c.model.*;
import com.max.b2c.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserInfoService {
   ServerResponse registerUserInfo(UserInfo userInfo, UserLogin userLogin);

   ServerResponse userLogin(String logintype, String password,  HttpServletResponse response);

    ServerResponse addUserAddrInfo(UserAddr userAddr);

    ServerResponse deleteUserAddrInfo(int addr_infoid);

    ServerResponse<List<UserAddr>> selectAddr_detail(HttpServletRequest request);

    UserAddr updateAddr_detail(UserAddr userAddr);

    ServerResponse selectUserInfo(int userid);

    int updateUsername(String username, int userid);

    int updateUsergender(int gender, int userid);

    int updateUserAvatar(String avatar, int userid);

    ServerResponse passwordreset(int userid, String oldpassword, String newpassword);

    ServerResponse logout();

    ServerResponse updateUserEmail(int userid, String newemail);

    ServerResponse securityinfo(Integer userid);
}
