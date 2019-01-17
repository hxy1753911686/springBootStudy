package org.spring.springboot.service.impl;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.entity.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Resource
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
        String key = "city_" + id;
        ValueOperations<String, City> valueOperations = redisTemplate.opsForValue();

        //判斷key是否存在
        boolean bflag = redisTemplate.hasKey(key);
        if (bflag) {
            City city = valueOperations.get(key);
            return city;
        }

        //redis中不存在key，從DB獲取
        City city = cityDao.findCityById(id);

        //將city插入緩存
        /*
            參數從左至右為
                鍵，值，過期時間，時間單位
         */
        valueOperations.set(key, city, 30, TimeUnit.SECONDS);
        return city;
    }

    @Override
    public List findAllCity() {
        List allCity = cityDao.findAllCity();
        return allCity;
    }

    /*
        儲存——redis：
            不對redis執行操作
     */
    @Override
    public Long saveCity(City city) {
        Long line = cityDao.saveCity(city);
        return line;
    }

    /*
        修改——redis：
            如果緩存存在，則刪除緩存
            如果緩存不存在，則不做操作
     */
    @Override
    public Long updateCity(City city) {
        Long line = cityDao.updateCity(city);

        String key = "city_" + city.getId();
        boolean bFlag = redisTemplate.hasKey(key);
        //如果緩存存在，刪除緩存
        if (bFlag) {
            redisTemplate.delete(key);
        }
        return line;

    }

    /*
        刪除——redis：

     */
    @Override
    public Long deleteCity(Long id) {
        Long line = cityDao.deleteCity(id);

        String key = "city_" + id;
        boolean bFlag = redisTemplate.hasKey(key);
        if (bFlag) {
            redisTemplate.delete(key);
        }
        return line;
    }
}
