package org.spring.springboot.web;

import org.spring.springboot.property.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HomeProperties homeProperties;

    @RequestMapping("/")
    public String sayHello(){
        return "Hello,World";
    }

    @RequestMapping("/home")
    public String seeHome(){
        return homeProperties.toString();
    }
}
