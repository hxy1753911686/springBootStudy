package org.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //程式启动入口
        //启动嵌入式tomcat并初始化spring配置及组件
        SpringApplication.run(Application.class,args);
    }
}
