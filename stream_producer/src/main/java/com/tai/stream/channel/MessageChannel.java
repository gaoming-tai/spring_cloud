package com.tai.stream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannel {
    String MYOUTPUT = "myoutput";

    @Output("myoutput")
    org.springframework.messaging.MessageChannel output();

    String MYINPUT = "myinput";

    @Input("myinput")
    SubscribableChannel input();
}
