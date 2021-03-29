package main;

public class WorkoutExcerciseAttempt extends ExerciseAttempt {

	WorkoutExercise workoutExercise;
	private int caloriesBurnt;

	public WorkoutExcerciseAttempt( WorkoutExercise workoutExercise, int caloriesBurnt, Exercise exercise, int attemptNumber) {
		super(attemptNumber, exercise);
		this.workoutExercise = workoutExercise;
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