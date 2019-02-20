package com.example.springboot.service;

import com.example.springboot.domain.User;
import com.example.springboot.domain.UserInfo;

import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 16:08
 * @Description:
 */
public interface UserInfoService {

    //查询所有用户的信息
    List<UserInfo> getUsers();

    //根据特定的一个属性值来查找某一条记录
    UserInfo getUser(UserInfo userInfo);

    //根据用户名密码查询数据库
    UserInfo checkUser(User user);

    //更新某一条记录
    void updateUser(UserInfo user);

    //插入一条数据记录
    int insertUser(UserInfo user);

    //删除一条数据库记录
    int deleteUser(Integer id);

    //插入一个集合数据
    void addUsers(List list);
}
