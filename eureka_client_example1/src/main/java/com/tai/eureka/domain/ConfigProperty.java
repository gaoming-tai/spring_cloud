package com.tai.eureka.domain;/**
 * Created by gaoming on 2020/3/24.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/24
 * @Description 自动加载自定义属性
 */
@Component
public class ConfigProperty {

    @Value("${spring.tai.url}")
    private String url;
    @Value("${spring.tai.port}")
    private String port;
    @Value("${spring.tai.timeout}")
    private String timeout;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
