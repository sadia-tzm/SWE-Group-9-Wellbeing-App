package main;
public class ActivityExercise extends WorkoutExercise {

	private int difficulty;

	public ActivityExercise(String eexerciseName, int ddifficulty) {
		super(eexerciseName);
		this.difficulty = ddifficulty;
	}

	public void setDifficulty(int newDifficulty){
		this.difficulty = newDifficulty;
	}

	public int getDifficulty(){
		return this.difficulty;
	}

}