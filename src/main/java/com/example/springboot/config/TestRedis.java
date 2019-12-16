package com.example.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import redis.clients.jedis.Jedis;

/**
 * @ClassName: TestRedis
 * @Description:
 * @Author: xuxufu
 * @Date: 19.4.16 15:51
 * @Version: 1.0
 */
public class TestRedis {

    @Autowired
    private static StringRedisTemplate template;
    public static void main(String[] args) {

        template.opsForValue().set("4454","45454545");
        String string1 = template.opsForValue().get("4454");
        System.out.println(string1);
        /*Jedis jedis = new Jedis("192.168.43.40", 6379);
        jedis.set("jj", "45454545454545");
        String string = jedis.get("jj");
        System.out.println(string);*/
    }
}
