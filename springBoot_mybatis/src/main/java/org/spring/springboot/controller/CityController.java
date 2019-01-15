package org.spring.springboot.controller;

import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

//@RestController   如果要跳頁面，必須用Controller
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String gotoIndex(HashMap<String,Object> map){
        return "/showCity";
    }

    @RequestMapping(value = "/findOneCity",method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName",required = true)String cityName){
        return cityService.findByName(cityName);
    }

    public void
}
