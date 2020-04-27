package com.tai.eureka.service;


import com.tai.eureka.domain.T_bh_dcasemsg;

import java.util.List;
/**
* @Author gaoming
* @Description 电子工单业务层接口
* @Date
* @Param
* @return
**/
public interface TbhCaseService {
    //查询所有数据
    List<T_bh_dcasemsg> findAll(String caseId);

    List<T_bh_dcasemsg> findAll();
}
