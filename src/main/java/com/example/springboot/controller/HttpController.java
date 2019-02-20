package com.example.springboot.controller;

import com.example.springboot.domain.UserInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 19.1.29 16:46
 * @Description:
 */
@RestController
public class HttpController {

    @ApiOperation(value = "获取sessionid", notes = "获取sessionid")
    @RequestMapping(value = "/getSessionId", method = RequestMethod.POST)
    public String getSessionId() {
        //定义全局变量str
        final HashMap<Object, Object> map = new HashMap<>();
        /*String str = "";*/
        //获取到当前线程绑定的请求对象
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Cookie[] cookies = request.getCookies();
        return cookies.toString();
    }
}
