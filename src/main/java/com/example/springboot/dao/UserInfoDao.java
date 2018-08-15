package com.example.springboot.dao;

import com.example.springboot.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:58
 * @Description:
 */
@Mapper
public interface UserInfoDao {

    //用户信息查询接口
    List<UserInfo> getUsers();
    //通过id查询某一条记录信息
    UserInfo getUser(Integer id);
    //更新某一条记录中的某个字段值
    void updateUser(UserInfo user);
    //数据库中添加一条记录数据
    void insertUser(UserInfo user);
    //删除数据库中的一条记录数据
    int deleteUser(Integer id);

    //向数据库中添加一个list集合
    void addUsers(List list);
}
