package com.lihui.jmsListener.queueconfig;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootConfiguration
public class QueueConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("lihui01message");
    }
}
