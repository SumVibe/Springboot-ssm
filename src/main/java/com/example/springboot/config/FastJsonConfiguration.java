/*
package com.example.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class FastJsonConfiguration extends WebMvcConfigurationSupport {

    */
/**
     * 修改自定义消息转换器
     * *//*

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //调用父类接口
        super.configureMessageConverters(converters);
        //创建FastJosn 转换器
        FastJsonHttpMessageConverter fastComverter = new FastJsonHttpMessageConverter();
        //创建配置类
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //修改返回内容过滤
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect
//              SerializerFeature.WriteNullListAsEmpty
//              SerializerFeature.WriteMapNullValue//是否输出为null的字段
        );
        fastComverter.setFastJsonConfig(fastJsonConfig);
        //将fastjson添加到视图消息转换器列表内
        converters.add(fastComverter);
    }
}*/
