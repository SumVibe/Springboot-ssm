package com.example.springboot.service.impl;
import com.example.springboot.dao.UserInfoDao;
import com.example.springboot.domain.User;
import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 16:10
 * @Description:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> getUsers() {
        //创建用户信息集合
        List<UserInfo> resList = new ArrayList<>();
        resList = userInfoDao.getUsers();
        return resList;
    }

    @Override
    public UserInfo getUser(UserInfo userInfo) {
        UserInfo user = userInfoDao.getUser(userInfo);
        return user;
    }

    @Override
    public UserInfo checkUser(User user) {
        UserInfo user1= userInfoDao.checkUser(user);
        return user1;
    }

    @Override
    public void updateUser(UserInfo user) {
        userInfoDao.updateUser(user);
    }

    @Override
    public int insertUser(UserInfo user) {
        //用户记录数据的插入
        int n = userInfoDao.insertUser(user);
        return n;
    }

    @Override
    public int deleteUser(Integer id) {
        int i = userInfoDao.deleteUser(id);
        return i;
    }

    @Override
    public void addUsers(List list) {
        userInfoDao.addUsers(list);
    }
}
