package com.hunman.resource.hrapp.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "jdbc")
@PropertySource("classpath:prop.properties")
@Component
public class PropConf {

    /**
     * jdbc链接:驱动
     */
    private String driver;

    /**
     * jdbc链接:链接
     */
    private String url;

    /**
     * jdbc链接:账户
     */
    private String username;

    /**
     * jdbc链接:密码
     */
    private String password;

    /**
     * 连接池中最大连接数
     */
    private int maxActive;

    /**
     * 连接池中最大空闲连接数
     */
    private int maxIdel;

    /**
     * 当连接池资源耗尽时，调用最大阻塞时间
     */
    private int maxWait;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdel() {
        return maxIdel;
    }

    public void setMaxIdel(int maxIdel) {
        this.maxIdel = maxIdel;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }
}
