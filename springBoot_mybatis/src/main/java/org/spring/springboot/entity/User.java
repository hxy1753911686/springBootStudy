package org.spring.springboot.entity;

public class User {
    //用戶id
    private int id;
    //用戶名稱
    private String userName;
    //用戶簡介
    private String userDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userDesc='" + userDesc + '\'' +
                '}';
    }
}
