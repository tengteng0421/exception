package com.teng.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceController {
    @RequestMapping("@{page}")
    public String showPage(@PathVariable String page){
        int i = 1/0;
        return page;
    }
}
