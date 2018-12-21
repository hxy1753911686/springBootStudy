package org.spring.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    //用戶id
    private Long id;
    //用戶年齡
    private int age;
    //用戶描述
    private String desc;
    //用戶uuid
    private String uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "UserProperties{" +
                "id=" + id +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
