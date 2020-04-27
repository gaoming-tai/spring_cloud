package com.tai.eureka.dao;

import com.tai.eureka.domain.T_bh_dcasemsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by gaoming on 2020/3/23.
 */
@Mapper   //mybatis的版本要求3.3以上
public interface TbhCaseMapper {

    @Select("select * from t_bh_case where case_id like '%${value}%'")
    List<T_bh_dcasemsg>  getCaseBycaseId(String case_id);

    @Select("select * from t_bh_case")
    List<T_bh_dcasemsg> getCaseAll();
}
