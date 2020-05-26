package com.tai.stream;

import com.tai.stream.producer.MessageSender;
import com.tai.stream.producer.MyMessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther gaoming
 * @create 2020/5/25
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProducerTest {

    @Autowired
    private MessageSender messageSender;
    @Autowired
    private MyMessageSender myMessageSender;


    @Test
    public void sendTest() throws Exception {
        messageSender.send("Hellow RabbitMQ");
    }

    @Test
    public void mySendTest() throws Exception {
        myMessageSender.send("Hellow RabbitMQ my defination....");
    }
}
