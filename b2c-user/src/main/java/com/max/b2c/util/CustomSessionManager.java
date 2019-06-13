package com.max.b2c.util;



import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;

public class CustomSessionManager {

//        /**
//         * 获取请求头中key为“Authorization”的value == sessionId
//         */
//        private static final String AUTHORIZATION ="Authorization";
//
//        private static final String REFERENCED_SESSION_ID_SOURCE = "cookie";
//
//        /**
//         *  @Description shiro框架 自定义session获取方式<br/>
//         *  可自定义session获取规则。这里采用ajax请求头 {@link AUTHORIZATION}携带sessionId的方式
//         */
//        @Override
//        protected  Serializable getSessionId(ServletRequest request, ServletResponse response) {
//            // TODO Auto-generated method stub
//            String sessionId = WebUtils.toHttp(request).getHeader(AUTHORIZATION);
//            System.out.println(sessionId);
//            if (StringUtils.isNotEmpty(sessionId)) {
//                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, REFERENCED_SESSION_ID_SOURCE);
//                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, sessionId);
//                request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
//                return sessionId;
//            }
//            //如果没有获取到，则尝试从cookie中获取
//            return super.getSessionId(request, response);

        }




