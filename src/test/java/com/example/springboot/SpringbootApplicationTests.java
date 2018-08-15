package com.example.springboot;

import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void contextLoads() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setName("周杰伦");
		userInfo.setAge(8);
		try {
			userInfoService.updateUser(userInfo);
			System.out.println("测试更新数据成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("测试更新数据失败");
		}

	}
}
