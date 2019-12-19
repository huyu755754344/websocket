package com.huyu.websocket.controller;

import com.huyu.websocket.pojo.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {


    @RequestMapping()
    public String hello(){
        return "index";
    }
    @MessageMapping("/message")
    public void me(Message me){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(me.message+me.toName+me.name);
    }
}
