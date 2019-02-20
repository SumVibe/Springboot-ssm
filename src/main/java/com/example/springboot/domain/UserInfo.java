package com.example.springboot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:34
 * @Description: 注册用户信息的实体类
 */

/**
 *
 @ApiModel: 用于响应类上，表示一个返回响应数据的信息
 (这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
 @ApiModelProperty: 用在相应类的属性上，描述响应类的属性
 value：参数名称
 required：是否必须boolean
 hidden：是否隐藏hidden
 *
 */
@ApiModel(value = "用户对象User")
public class UserInfo {
    @ApiModelProperty(value = "用户id", name = "id")
    private String id;//用户id-主键
    @ApiModelProperty(value = "用户名", name = "username")
    private String username;//用户名
    @ApiModelProperty(value = "用户密码", name = "password")
    private String password;//密码
    @ApiModelProperty(value = "用户姓名", name = "name")
    private String name;//姓名
    @ApiModelProperty(value = "用户性别", name = "sex")
    private String sex;//性别
    @ApiModelProperty(value = "用户手机号", name = "phoneNum")
    private String phoneNum;//手机号
    @ApiModelProperty(value = "用户邮箱", name = "mail")
    private String mail;//邮箱

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", phoneNum='").append(phoneNum).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
