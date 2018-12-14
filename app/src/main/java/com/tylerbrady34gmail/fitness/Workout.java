package com.tylerbrady34gmail.fitness;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    //TODO name/description of workout
    private List<IExercise> exerciseList;
    //date//

    public Workout(List<IExercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public Workout() {
        exerciseList = new ArrayList<>();
    }


    public List<IExercise> getExercise(){
        return exerciseList;
    }

    public void addExercise(List<IExercise> list){
        for(int i = 0; i < list.size(); i++){
            exerciseList.add(list.get(i));
        }
    }

    public void addExercise(IExercise exercise) {
        exerciseList.add(exercise);
    }
}
