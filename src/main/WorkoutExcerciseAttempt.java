package main;

import java.time.Instant;
import java.time.LocalDateTime;

public class WorkoutExcerciseAttempt extends ExerciseAttempt {

	WorkoutExercise workoutExercise;
	private int caloriesBurnt;
	private long duration;

	public WorkoutExcerciseAttempt(LocalDateTime dateCompleted, LocalDateTime dateLogged,  WorkoutExercise workoutExercise, int caloriesBurnt, long duration, Instant startTime, Instant endTime, Exercise exercise, int attemptNumber) {
		super(dateCompleted, dateLogged, duration, attemptNumber, endTime, exercise);
		this.workoutExercise = workoutExercise;
		this.caloriesBurnt = caloriesBurnt;
		this.duration = duration;
	}

	public int getCaloriesBurnt() {
		return this.caloriesBurnt;
	}

	public WorkoutExercise getWorkoutExcerciseAttempt(){
		return this.workoutExercise;
	}

	public void editEntry(long newDuration, int newCaloriesBurnt) {
		this.duration = newDuration;
		this.caloriesBurnt = newCaloriesBurnt;
	}

	public void editEntry(int newCaloriesBurnt) {
		this.caloriesBurnt = newCaloriesBurnt;
	}

	public void editEntry(long newDuration) {
		this.duration = newDuration;
	}

}