package com.tai.stream.consumer;

import com.tai.stream.channel.MessageChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Description 从消息中间件接收消息
 * 1.定义消息通道接口
 * 2.绑定消息通道
 * 3.配置一个监听方法：当程序从消息中间件中获取到消息后，执行的业务逻辑
 * 需要在方法上配置@StreamListener
 */
@Component
@EnableBinding(MessageChannel.class)  //绑定消息通道
public class MyMessageListener {
    //监听bingding中的消息
    @StreamListener(MessageChannel.MYINPUT)
    public void input(String message) {
        System.out.println("自定义消息通道：从消息中间件中获取到消息："+message);
    }
}
