package com.huyu.websocket.controller;


import com.huyu.websocket.entity.Student;
import com.huyu.websocket.mapper.MyMapper;
import com.huyu.websocket.pojo.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    MyMapper  myMapper;

    @RequestMapping()
    public String hello(){
        System.out.println(myMapper.fuckYou().getsName());
        System.out.println(myMapper.fuckYou().getScore().getsScore());
       return "index2";
    }
    @MessageMapping("message")
    public void me(Message me){
        System.out.println(me.getMessage());
    }

    @RequestMapping("student")
    @ResponseBody
    public List<Student> student(){
        return myMapper.selectAllStudent();
    }

}
