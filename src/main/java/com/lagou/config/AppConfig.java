package com.lagou.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hezifeng
 * @create 2022/8/19 16:27
 */
@Configuration
@ComponentScan("com.lagou")
public class AppConfig {
    {
        System.out.println("ComponentScan.....");
    }
}
