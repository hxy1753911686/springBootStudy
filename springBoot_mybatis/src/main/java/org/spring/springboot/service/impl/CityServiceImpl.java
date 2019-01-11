package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    /*
        查詢——redis：
            如果redis中存在，則從redis中獲取
            如果redis中不存在，則從DB中獲取，并放入緩存
     */
    @Override
    public City findCityById(Long id) {
        return null;
    }

    /*
        儲存——redis：
            不對redis執行操作
     */
    @Override
    public Long saveCity(City city) {
        return null;
    }

    /*
        修改——redis：
            如果緩存存在，則刪除緩存
            如果緩存不存在，則不做操作
     */
    @Override
    public Long updateCity(City city) {
        return null;
    }

    /*
        刪除——redis：

     */
    @Override
    public Long deleteCity(Long id) {
        return null;
    }
}
