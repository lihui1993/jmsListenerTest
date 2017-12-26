package com.lihui.jmsListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class JmsMessageListener {
    private static final Logger logger= LoggerFactory.getLogger(JmsMessageListener.class);

    @JmsListener(destination = "lihui02ling")
    public void getMessage(String message){
        logger.info("====JmsListener收到消息====={}",message);
    }

}
