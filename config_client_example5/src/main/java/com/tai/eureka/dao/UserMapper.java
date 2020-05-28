package com.tai.eureka.dao;

import com.tai.eureka.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by gaoming on 2020/3/31.
 */
@Mapper
public interface UserMapper {

    //查用户名
    User getUserByName(String name);
}




