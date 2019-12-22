package com.huyu.websocket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @RequestMapping("luckDraw")
    public String luckDraw(){
        return null;
    }
}
