package com.itheima.controller;

import com.itheima.aop.aopLog;
import com.itheima.interceptor.interceptorLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("index")
    @aopLog
    @interceptorLog
    public String Index(){
        System.out.println("-------controller方法内");
        return "success";
    }
}
