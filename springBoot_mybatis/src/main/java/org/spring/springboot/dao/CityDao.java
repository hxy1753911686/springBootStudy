package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.entity.City;

public interface CityDao {

    City findByName(@Param("cityName") String cityName);
    City findCityById(@Param("id") Long id);
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(@Param("id") Long id);
}
