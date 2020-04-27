package com.tai.eureka.controller;/**
 * Created by gaoming on 2020/3/19.
 */

import com.tai.eureka.domain.T_bh_dcasemsg;
import com.tai.eureka.service.TbhCaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/3/19
 * @Description TODO
 */
@RestController
public class TbhCaseController {
    Logger logger = LoggerFactory.getLogger(TbhCaseController.class);
    @Autowired
    private TbhCaseService tbhCaseService;

    @RequestMapping("/findAll/{caseId}")
    public List<T_bh_dcasemsg> findAll(@PathVariable("caseId")String caseId){
        List<T_bh_dcasemsg> list =  tbhCaseService.findAll(caseId);
        for(T_bh_dcasemsg t_bh_dcasemsg:list){
            logger.debug("caseId:"+t_bh_dcasemsg.getCase_id());
        }
        return list;
    }

    @RequestMapping("/findAllData")
    public List<T_bh_dcasemsg> findAllData(){
        List<T_bh_dcasemsg> list =  tbhCaseService.findAll();
        for(T_bh_dcasemsg t_bh_dcasemsg:list){
            logger.debug("caseId:"+t_bh_dcasemsg.getCase_id());
        }
        return list;
    }
}
