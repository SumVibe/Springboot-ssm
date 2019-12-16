package com.example.springboot;

import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	// 注入用户操作服务
	@Autowired
	private UserInfoService service;
    @Test
	public void test1() {
        UserInfo user = new UserInfo();
        user.setId("123");
        user.setName("周杰伦");
        user.setPassword("44444");
        int i = service.insertUser(user);
        List<UserInfo> users = service.getUsers();
        System.out.println(users);
    }

    @Test
    //@Transactional
	public void test2() {
        UserInfo user = new UserInfo();
        user.setId("12");
        user.setName("jjj");
        user.setPassword("5555");
        int i = service.insertUser(user);
        List<UserInfo> users = service.getUsers();
        System.out.println(users);
    }
}
