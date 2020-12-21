package com.offcn.springsessiondemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @GetMapping("/set")
    @ResponseBody
    public String setSession(HttpSession session){
        session.setAttribute("msg","hello");
        return "ok";
    }

    @GetMapping("/get")
    @ResponseBody
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
