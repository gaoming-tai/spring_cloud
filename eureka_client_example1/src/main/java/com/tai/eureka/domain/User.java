package com.tai.eureka.domain;/**
 * Created by gaoming on 2020/3/25.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/25
 * @Description TODO
 */
@ApiModel(description = "用户实体类")
public class User {
    @ApiModelProperty(value="姓名")
    private String name;
    @ApiModelProperty(value="性别")
    private String sex;
    @ApiModelProperty(value="年龄")
    private Integer age;
    @ApiModelProperty(value="地址")
    private String address;
    @ApiModelProperty(value="邮箱")
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
