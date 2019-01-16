package org.spring.springboot.entity;

import java.io.Serializable;

public class City implements Serializable {
    //城市編號
    private int id;
    //省份id
    private int provinceId;
    //城市名稱
    private String cityName;
    //城市描述
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", province_id=" + provinceId +
                ", city_name='" + cityName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
