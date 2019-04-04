package com.example.springboot.domain;
/**
 * @Author: xuxufu
 * @Date: 19.3.13 17:34
 * @Description:
 */

public class Params {
    private String showapi_appid;
    private String num;

    private String showapi_sign;

    private String page;
    private String type;
    private String order;
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getShowapi_appid() {
        return showapi_appid;
    }

    public void setShowapi_appid(String showapi_appid) {
        this.showapi_appid = showapi_appid;
    }

    public String getShowapi_sign() {
        return showapi_sign;
    }

    public void setShowapi_sign(String showapi_sign) {
        this.showapi_sign = showapi_sign;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
