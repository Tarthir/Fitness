package com.tylerbrady34gmail.fitness;

public class User {
    private String name;
    private int age;
    private int height;
    private int weight;
    private Boolean metricUnit;

    User(String name, int age, int height, int weight, Boolean metricUnit) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.metricUnit = metricUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getMetricUnit() {
        return metricUnit;
    }

    public void setMetricUnit(Boolean metricUnit) {
        this.metricUnit = metricUnit;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", metricUnit=" + metricUnit +
                '}';
    }
}
