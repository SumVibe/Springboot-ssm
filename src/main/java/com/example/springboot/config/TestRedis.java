package com.example.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @ClassName: TestRedis
 * @Description: 这个是什么问题springbootconfigrun code analyze
 * @Author: xuxufu
 * @Date: 19.4.16 15:51
 * @Version: 1.0
 */
public class TestRedis {

    @Autowired
    private static StringRedisTemplate template;
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool();
        Jedis resource = jedisPool.getResource();
        resource.set("jjj", "gggg");
        String string = resource.get("jjj");
        System.out.println(string);
    }
}
