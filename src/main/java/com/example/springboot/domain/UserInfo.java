package com.example.springboot.domain;

/**
 * @Author: xuxufu
 * @Date: 18.8.9 15:34
 * @Description: 注册用户信息的实体类
 */
public class UserInfo {

    private String id;//用户id-主键
    private String username;//用户名
    private String password;//密码
    private String name;//姓名
    private String sex;//性别
    private String phoneNum;//手机号
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
