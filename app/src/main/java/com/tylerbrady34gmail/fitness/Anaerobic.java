package com.tylerbrady34gmail.fitness;

public class Anaerobic implements IExercise {

    private String name;
    private int repetitions;
    private int weight;
    private int sets;
    // insert video//

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName() {

    }
}
