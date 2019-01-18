package org.spring.springboot.controller;

import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//@RestController   如果要跳頁面，必須用Controller
@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String gotoIndex(Model model) {
        List<City> list = cityService.findAllCity();
        model.addAttribute("cityList", list);
        return "/showCity";
    }

    @RequestMapping(value = "/findOneCity", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findByName(cityName);
    }

    @RequestMapping(value = "addCity", method = RequestMethod.POST)
    public String addNewCity(HashMap<String, Object> map) {
        return "/addCity";
    }

    @RequestMapping(value = "saveCity", method = RequestMethod.POST)
    public String saveCity(@ModelAttribute City city) {
        cityService.saveCity(city);
        return "/addCity";
    }

    @RequestMapping(value = "findCity", method = RequestMethod.POST)
    public String findCityById(@RequestParam(value = "cityId") Long cityId, Model model) {
        List<City> list = new ArrayList<City>();
        if (cityId != null) {
            City city = cityService.findCityById(cityId);
            list.add(city);
        } else {
            list = cityService.findAllCity();
        }

        model.addAttribute("cityList", list);
        return "/showCity";
    }

    @RequestMapping(value = "deleteCity/{id}", method = RequestMethod.POST)
    public String deleteCityById(@PathVariable("id") Long cityId, Model model) {
        cityService.deleteCity(cityId);
        List<City> list = cityService.findAllCity();
        model.addAttribute("cityList", list);
        return "/showCity";
    }

    @RequestMapping(value = "updateCity/{id}", method = RequestMethod.POST)
    public String toUpdateCity(@PathVariable("id") Long cityId, Model model) {
        City city = cityService.findCityById(cityId);
        model.addAttribute("city", city);
        return "/updateCity";
    }

    @RequestMapping(value = "updateCity", method = RequestMethod.POST)
    public String updateCity(@ModelAttribute City city, Model model) {
        cityService.updateCity(city);
        List<City> list = cityService.findAllCity();
        model.addAttribute("cityList", list);
        return "/showCity";
    }
}
