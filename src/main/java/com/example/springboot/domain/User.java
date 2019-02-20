package com.example.springboot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: xuxufu
 * @Date: 18.11.8 15:38
 * @Description: 登录时的用户对象
 */
@ApiModel(value = "登录用户User")
public class User {
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;
    @ApiModelProperty(value = "用户密码", name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
