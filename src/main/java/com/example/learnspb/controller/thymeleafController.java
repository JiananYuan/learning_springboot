package com.example.learnspb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class thymeleafController {

    @RequestMapping("helloHtml")
    public String hellothy(Map<String, Object> map) {
        map.put("hello", "jiananyuan");
        return "helloHtml";
    }
}
