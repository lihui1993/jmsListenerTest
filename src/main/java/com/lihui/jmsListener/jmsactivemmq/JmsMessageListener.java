package com.lihui.jmsListener.jmsactivemmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JmsMessageListener {

    @JmsListener(destination = "lihui01message")
    public void getMessage(String message){
        log.info("====JmsListener收到消息====={}",message);
    }

}
