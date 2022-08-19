package com.lagou;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * @author hezifeng
 * @create 2022/8/19 16:24
 */
public class SpringApplication {

    public static void run() {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        try {
            //设置项目文件路径
            tomcat.addWebapp("/","D:\\");
            //启动tomcat
            tomcat.start();
            //监听关闭端口，阻塞式，没这一句，方法执行完全直接结束
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
