package com.jie.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pengxinjie
 * @DATE 2022/11/3 - 17:09
 */
@RestController //返回json字符串，@Controller: ：返回页面
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
