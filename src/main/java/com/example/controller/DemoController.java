package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by share on 2018/12/29.
 */
@Controller
public class DemoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String say(){
        return "Hello Eily";
    }
}
