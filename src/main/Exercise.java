package main;
public abstract class Exercise {

	private String exerciseName;

	public Exercise(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public String getExerciseName() {
		return this.exerciseName;
	}

	public void setExerciseName(String newExerciseName){
		this.exerciseName = newExerciseName;
	}
}