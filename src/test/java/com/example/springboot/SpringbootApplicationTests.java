package com.example.springboot;

import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void findUserTest() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("zhonghh");
		UserInfo user = userInfoService.getUser(userInfo);
		System.out.println("数据查找成功，用户为：" + user);
	}
}
