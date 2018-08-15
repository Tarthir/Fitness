package com.tylerbrady34gmail.fitness;

public class Model {
    private User user;

    public User getUser(){
        return user;
    }

    public void makeUser(String name, int age, int height, int weight, Boolean metricUnit){
        user= new User(name, age, height, weight, metricUnit);
    }
}
