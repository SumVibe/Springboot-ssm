package com.example.springboot;

import com.example.springboot.domain.UserInfo;
import com.example.springboot.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootApplicationTests {

	@Autowired
	private UserInfoService userInfoService;

	//更新 数据库中记录的测试方法
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
	//单元测试向数据库中添加一个集合数据
   @Test
	public void testAddUsers() {
       //创建集合
	   List list = new ArrayList();
	   UserInfo user1 = new UserInfo();
	   UserInfo user2 = new UserInfo();
	   UserInfo user3 = new UserInfo();
	   user1.setId(100);
	   user1.setName("十一月的肖邦");
	   user1.setAge(10);

	   user2.setId(110);
	   user2.setName("不能说的秘密");
	   user2.setAge(15);

	   user3.setId(120);
	   user3.setName("七里香");
	   user3.setAge(1221);
	   list.add(user1);
	   list.add(user2);
	   list.add(user3);

	   try {
	   	userInfoService.addUsers(list);
		   System.out.println("集合添加成功");
	   } catch (Exception e) {
		   e.printStackTrace();
		   System.out.println("集合添加失败");
	   }
   }

	//测试根据特定的属性来进行查找某一条记录
	@Test
	public void findUserTest() {

		UserInfo userInfo = new UserInfo();
		//userInfo.setName("秘密");
		userInfo.setAge(1221);
		try {
			UserInfo user = userInfoService.getUser(userInfo);
			System.out.println("数据查找成功，用户为："+user);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据查找失败");
		}

	}
}
