package com.tai.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @version 1.0
 * @auther gaoming
 * @create 2020/4/27
 * @Description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringTest {
    private Logger logger = LoggerFactory.getLogger(SpringTest.class);
    @Autowired
    Environment environment;

    @Test
    public void getProperties(){
        logger.info("ip:"+environment.getProperty("spring.cloud.client.ip-address"));
        logger.info("port:"+environment.getProperty("server.port"));

    }

}
