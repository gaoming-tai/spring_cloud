package com.tai.eureka.service;/**
 * Created by gaoming on 2020/3/31.
 */


import com.tai.eureka.domain.User;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/31
 * @Description TODO
 */
public interface UserService {
    /**
    * @Author gaoming 
    * @Description 根据用户名查询用户
    * @Date  
    * @Param 
    * @return java.util.List<com.gm.springmvcdemo.domain.User>
    **/
    User getUserByName(String name);
}
