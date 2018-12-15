package com.tylerbrady34gmail.fitness;

public class Aerobic implements IExercise {
    //TODO description
    private String distance;
    private String name;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
