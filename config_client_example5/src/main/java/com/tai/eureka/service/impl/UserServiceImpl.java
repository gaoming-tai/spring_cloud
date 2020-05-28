package com.tai.eureka.service.impl;/**
 * Created by gaoming on 2020/3/31.
 */

import com.tai.eureka.dao.UserMapper;
import com.tai.eureka.domain.User;
import com.tai.eureka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/31
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
