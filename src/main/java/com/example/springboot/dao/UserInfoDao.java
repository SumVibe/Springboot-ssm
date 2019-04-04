package com.example.springboot.dao;

import com.example.springboot.domain.User;
import com.example.springboot.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:58
 * @Description:
 */
@Mapper
public interface UserInfoDao {

    /**
     * 用户信息查询接口
     * @Date: 9:37 19.3.20
     * @param
     * @return: java.util.List<com.example.springboot.domain.UserInfo>
     **/
    List<UserInfo> getUsers();
    /**
     * 通过id查询某一条记录信息
     * @Date: 9:37 19.3.20
     * @param userInfo
     * @return: com.example.springboot.domain.UserInfo
     **/
    UserInfo getUser(UserInfo userInfo);
    /**
     * 更新某一条记录中的某个字段值
     * @Date: 9:36 19.3.20
     * @param user
     * @return: void
     **/
    void updateUser(UserInfo user);
    /**
     * 数据库中添加一条记录数据
     * @Date: 9:36 19.3.20
     * @param user
     * @return: int
     **/
    int insertUser(UserInfo user);
    /**
     * 删除数据库中的一条记录数据
     * @Date: 9:35 19.3.20
     * @param id
     * @return: int
     **/
    int deleteUser(Integer id);
    /**
     * 向数据库中添加一个list集合
     * @Date: 9:35 19.3.20
     * @param list
     * @return: void
     **/
    void addUsers(List list);
    /**
     * 检验用户的身份的接口
     * @Date: 9:34 19.3.20
     * @param user
     * @return: com.example.springboot.domain.UserInfo
     **/
    UserInfo checkUser(User user);
}
