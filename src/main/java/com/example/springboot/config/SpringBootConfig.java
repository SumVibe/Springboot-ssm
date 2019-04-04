package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: xuxufu
 * @Date: 18.8.10 9:54
 * @Description: SpringBootConfig
 */
@Configuration
public class SpringBootConfig {
   /**
    * 在Application启动类中注册WebMvcConfigure 来解决跨域请求的问题
    * @Date: 10:35 19.3.20
    * @param
    * @return: org.springframework.web.servlet.config.annotation.WebMvcConfigurer
    **/
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}
