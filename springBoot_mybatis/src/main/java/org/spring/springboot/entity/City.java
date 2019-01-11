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

    public int getProvince_id() {
        return provinceId;
    }

    public void setProvince_id(int province_id) {
        this.provinceId = province_id;
    }

    public String getCity_name() {
        return cityName;
    }

    public void setCity_name(String city_name) {
        this.cityName = city_name;
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
