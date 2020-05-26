package com.tai.stream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @auther gaoming
 * 负责向消息中间件发送消息
 1.定义消息通道接口
 * 2.通过@EnableBinding
 */
@Component
@EnableBinding(Source.class)  //绑定消息通道
public class MessageSender {
    @Autowired
    MessageChannel output; //消息通道
    /**
    * @Description 发送消息内容
    **/
    public void send(Object object) throws Exception {
        //发送消息
        output.send(MessageBuilder.withPayload(object).build());
    }
}
