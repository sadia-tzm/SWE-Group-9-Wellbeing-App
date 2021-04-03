package main;

public class WorkoutExcerciseAttempt extends ExerciseAttempt {

	WorkoutExercise workoutExercise;
	private int caloriesBurnt;

	public WorkoutExcerciseAttempt(int caloriesBurnt, WorkoutExercise workoutExercise, int attemptNumber) {
		super(attemptNumber, new Exercise(workoutExerciseName));
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