package com.tai.eureka.domain;/**
 * Created by gaoming on 2020/3/25.
 */

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/25
 * @Description TODO
 */
public class User {
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private String email;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
