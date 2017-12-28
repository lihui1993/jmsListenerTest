package com.lihui.jmsListener;

import com.lihui.jmsListener.jmsactivemmq.JmsMessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsMessageProducerTest {
    @Autowired
    private JmsMessageProducer jmsMessageProducer;
    @Test
    public void jmsProducerTest(){
        jmsMessageProducer.sendMessage();
    }
}
