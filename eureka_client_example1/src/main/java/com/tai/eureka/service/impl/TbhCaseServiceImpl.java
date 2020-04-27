package com.tai.eureka.service.impl;/**
 * Created by gaoming on 2020/3/19.
 */

import com.tai.eureka.dao.TbhCaseMapper;
import com.tai.eureka.domain.T_bh_dcasemsg;
import com.tai.eureka.service.TbhCaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/19
 * @Description 电子工单业务层接口实现类
 */
@Service
public class TbhCaseServiceImpl implements TbhCaseService {

    Logger logger = LoggerFactory.getLogger(TbhCaseServiceImpl.class);
    @Autowired
    private TbhCaseMapper caseMapper;

    @Override
    public List<T_bh_dcasemsg> findAll(String caseId) {
        logger.info("----电子工单业务层接口实现，所有电子工单数据----");
        return caseMapper.getCaseBycaseId(caseId);
    }

    @Override
    public List<T_bh_dcasemsg> findAll() {
        return caseMapper.getCaseAll();
    }
}
