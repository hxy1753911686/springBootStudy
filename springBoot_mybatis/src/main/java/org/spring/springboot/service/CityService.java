package org.spring.springboot.service;

import org.spring.springboot.entity.City;

public interface CityService {
    City findByName(String cityName);
}
