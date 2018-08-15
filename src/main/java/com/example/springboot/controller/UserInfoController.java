package com.example.springboot.controller;

import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:37
 * @Description:
 */
@RestController
@Slf4j
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
    public UserInfo getUser(Integer id) {
       UserInfo user = userInfoService.getUser(id);
       return user;
    }

    //更新数据库中的某一条记录，指定访问路径，请求方式以及 请求参数@requestbody 注解
    @RequestMapping(value = "/updateUser",method = {RequestMethod.POST},produces = "application/json")
    public void updateUser(@RequestBody UserInfo user) {

        try {
            userInfoService.updateUser(user);
            /*if (log.isInfoEnabled()) {
                log.info("更新用户数据成功"+"id == "
                        +user.getId()+", name == "
                        +user.getName()+", age == "
                         +user.getAge());
            }*/
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据更新失败");
        }
    }
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST,produces = "application/json")
    public void insertUser(UserInfo user) {
        userInfoService.insertUser(user);
        if (log.isInfoEnabled()) {
            log.info("数据插入成功");
        } else {
            log.info("数据插入失败");
        }
    }

    //删除某一条记录数据
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public int deleteUser(Integer id) {
        int i = userInfoService.deleteUser(id);
        if (i == 1) {
            log.info("数据删除成功");
        } else {
            log.info("数据删除失败");
        }
        return i;
    }
}
