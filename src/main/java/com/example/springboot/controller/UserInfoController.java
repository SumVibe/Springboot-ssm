package com.example.springboot.controller;

import com.example.springboot.domain.User;
import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import com.example.springboot.util.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:37
 * @Description:
 */

@RestController
public class UserInfoController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    //查询所有用户的信息
    //@RequestMapping(value = "/getUsers",method= RequestMethod.GET) 本可以相互替换的
    @ApiOperation(value = "获取User列表", notes = "获取所有User对象")
    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public List<UserInfo> getUsers() {
        logger.info("获取用户列表");
        List<UserInfo> users = userInfoService.getUsers();
        return users;
    }

    //通过用户id查询到某个用户的信息
    @ApiOperation(value = "获取单个用户信息", notes = "获取单个用户的对象属性")
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    @ResponseBody
    public UserInfo getUser(@RequestBody UserInfo userInfo) {
        UserInfo user = userInfoService.getUser(userInfo);
        user.setPassword(ParamValues.CODE_TYPE.MSG_TFBOY);
        return user;
    }

    //更新数据库中的某一条记录，指定访问路径，请求方式以及 请求参数@requestbody 注解 /updateUser
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息的具体的属性字段")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public void updateUser(@RequestBody UserInfo user) {
        try {
            userInfoService.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据更新失败");
        }
    }

    // 添加用户 insertUser
    @ApiOperation(value = "添加用户", notes = "添加新的用户")
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public int insertUser(UserInfo user) {
        int n = 0;
        try {
            String pwd = MD5Util.md5Encode(user.getPassword());
            user.setPassword(pwd);
            n = userInfoService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }

    //删除某一条记录数据
    @ApiOperation(value = "删除某个用户", notes = "删除某个用户的信息")
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public int deleteUser(@ApiParam(value = "用户id", required = true) @RequestParam("id") Integer id) {
        int i = userInfoService.deleteUser(id);
        return i;
    }

    //添加一个集合数据 addUsers
   /* @ApiOperation(value = "添加多个用户",notes = "批量添加用户信息")
    @PostMapping(value = "/addUsers")*/
    public void addUsers(List list) {
        try {
            userInfoService.addUsers(list);
            /*log.info("数据集合插入成功");*/
            System.out.println("数据集合插入成功");
        } catch (Exception e) {
            e.printStackTrace();
            /* log.info("数据集合插入失败");*/
            System.out.println("数据集合插入失败");
        }
    }

    //用户登录的方法实现 login
    @ApiOperation(value = "用户注册", notes = "注册用户基本信息")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@ApiParam(value = "用户名", required = true) @RequestParam("username") String username,
                        @ApiParam(value = "用户名", required = true) @RequestParam("password") String password) {
        //定义全局变量
        String flag = "";
        try {
            User user = new User();
            user.setUsername(username);
            String pass = MD5Util.md5Encode(password);
            user.setPassword(pass);
            UserInfo user1 = userInfoService.checkUser(user);
            if (user1 != null) {
                flag = "1";
            } else {
                flag = "0";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
