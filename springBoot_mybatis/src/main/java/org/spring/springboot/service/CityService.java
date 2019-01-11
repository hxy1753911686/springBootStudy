package org.spring.springboot.service;

import org.spring.springboot.entity.City;

public interface CityService {
    City findByName(String cityName);
    City findCityById(Long id);
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}
