//framework for unused class WorkoutExcerciseAttempt:


//--------------------------------------------------------

package com.extra;

import com.ExerciseAttempt;

public class WorkoutExcerciseAttempt extends ExerciseAttempt {

	WorkoutExercise workoutExercise;
	private int caloriesBurnt;

	public WorkoutExcerciseAttempt(int caloriesBurnt, WorkoutExercise wworkoutExercise, int attemptNumber) {
		super(attemptNumber);
		this.caloriesBurnt = caloriesBurnt;
	}

	public int getCaloriesBurnt() {
		return this.caloriesBurnt;
	}

	public WorkoutExercise getWorkoutExcerciseAttempt(){
		return this.workoutExercise;
	}

	public void editEntry(int newCaloriesBurnt) {
		this.caloriesBurnt = newCaloriesBurnt;
	}
}