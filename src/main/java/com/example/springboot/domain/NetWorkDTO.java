package com.example.springboot.domain;

/**
 * @ClassName: NetWork
 * @Description:
 * @Author: xuxufu
 * @Date: 19.4.12 15:49
 * @Version: 1.0
 */
public class NetWorkDTO {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetWorkDTO netWork = (NetWorkDTO) o;

        if (name != null ? !name.equals(netWork.name) : netWork.name != null) return false;
        return url != null ? url.equals(netWork.url) : netWork.url == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
