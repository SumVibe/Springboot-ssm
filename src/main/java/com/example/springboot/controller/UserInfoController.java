package com.example.springboot.controller;

import com.example.springboot.domain.User;
import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import com.example.springboot.util.MD5Util;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:37
 * @Description:
 */
@Api
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    //查询所有用户的信息
    @RequestMapping(value = "/getUsers")
    public List<UserInfo> getUsers() {

        List<UserInfo> users = userInfoService.getUsers();
        return users;
    }

    //通过用户id查询到某个用户的信息
    @RequestMapping(value = "/getUser")
    public UserInfo getUser(UserInfo userInfo) {
        UserInfo user = userInfoService.getUser(userInfo);
        user.setPassword(ParamValues.CODE_TYPE.MSG_TFBOY);
        return user;
    }

    //更新数据库中的某一条记录，指定访问路径，请求方式以及 请求参数@requestbody 注解
    @RequestMapping(value = "/updateUser", method = {RequestMethod.POST}, produces = "application/json")
    public void updateUser(@RequestBody UserInfo user) {

        try {
            userInfoService.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据更新失败");
        }
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = "application/json")
    public void insertUser(UserInfo user) {
        try {
            String pwd = MD5Util.md5Encode(user.getPassword());
            user.setPassword(pwd);
            userInfoService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //删除某一条记录数据
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public int deleteUser(Integer id) {
        int i = userInfoService.deleteUser(id);
        return i;
    }

    //添加一个集合数据
    @RequestMapping(value = "/addUsers", method = RequestMethod.POST)
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

    //用户登录的方法实现
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) {
        //定义一个返回数据标识
        String flag = "";
        UserInfo user1 =null;
        //首先判断输入信息是否为空
        if (user != null) {
            if (!StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())) {
                try {
                    String s = MD5Util.md5Encode(user.getPassword());
                    user.setPassword(s);
                    user1 = userInfoService.checkUser(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (user1 != null) {
                    flag = "1";
                } else {
                    flag = "0";
                }
            }
        } else {
            return "用户信息为空";
        }
        return flag;
    }

}
