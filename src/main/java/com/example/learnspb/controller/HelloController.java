package com.example.learnspb.controller;

import com.example.learnspb.bean.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public Demo hello() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Jack");
        return demo;
    }

}
