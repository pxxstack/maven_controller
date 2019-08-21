package com.dohia.controller;

import com.dohia.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/find")
    public String find(){
//        System.out.println("我来啦");
        testService.save();
        return "../success.jsp";
    }
}
