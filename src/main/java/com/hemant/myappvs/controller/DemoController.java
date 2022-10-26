package com.hemant.myappvs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @RequestMapping("/test")
    @ResponseBody
    public String handle(){
        return "This is just for fun";
    }

}
