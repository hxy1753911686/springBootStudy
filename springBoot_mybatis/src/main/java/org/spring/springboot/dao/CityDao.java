package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.entity.City;

public interface CityDao {

    City findByName(@Param("cityName") String cityName);
}
