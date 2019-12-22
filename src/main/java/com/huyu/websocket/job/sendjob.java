package com.huyu.websocket.job;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class sendjob {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    @Scheduled(fixedRate = 5000)
    public void helloWord(){
        simpMessagingTemplate.convertAndSend("/server/sendMessage","helloWord");
    }

    @Scheduled(fixedRate = 2000)
    public void helloHuYu(){
        simpMessagingTemplate.convertAndSendToUser("HuYu","sendMessage","HelloHuYu");
    }

}
