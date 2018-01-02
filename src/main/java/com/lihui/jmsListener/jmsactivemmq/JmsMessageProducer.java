package com.lihui.jmsListener.jmsactivemmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import java.util.Date;

/**
 * @author admin
 */
@Service
public class JmsMessageProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    public void sendMessage(){
        for (int i=0;i<20;i++){
            jmsMessagingTemplate.convertAndSend(queue,"消息["+i+"]==="+new Date());
        }
    }
}
