package com.usaskcssait.demo.object;

public class user {

    int id;

    boolean isMale;

    double height;

    int age;

    String name;

    String wechatId;

    public user(int id, boolean isMale, double height, int age, String name, String wechatId) {
        this.id = id;
        this.isMale = isMale;
        this.height = height;
        this.age = age;
        this.name = name;
        this.wechatId = wechatId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        this.isMale = male;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }
}
