package com.jie.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pengxinjie
 * @DATE 2022/11/3 - 17:09
 */
@RestController //返回json字符串，@Controller: ：返回页面
public class TestController {

    // @Value注解：导入自定义的配置项，：default，默认配置（如果没有配置）
    @Value("${test.myname:default}")
    private String MyName;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello "+name+",my name is "+MyName+".";
    }
}
