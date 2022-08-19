package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezifeng
 * @create 2022/8/19 16:32
 */
@RestController
public class TestController {

    @RequestMapping("/test/hello")
    public String test() {
        System.out.println("...hello...");
        return "hello";
    }

}
