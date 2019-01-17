package org.spring.springboot.service;

import org.spring.springboot.entity.City;

import java.util.List;

public interface CityService {
    City findByName(String cityName);
    City findCityById(Long id);
    List findAllCity();
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}
