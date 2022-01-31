package com.example.learnspb.controller;

import com.example.learnspb.bean.Demo;
import com.example.learnspb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public Demo hello() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("Jack");
        return demo;
    }

    @RequestMapping("divide")
    public int zeroException() {
        return 5 / 0;
    }

    @ResponseBody
    @RequestMapping("save")
    public String save(@RequestParam String name) {
        demoService.save(new Demo(name));
        return "the data has been saved!!";
    }

    @RequestMapping("2022")
    public String greet() {
        return "新年好! ";
    }

}
