package com;

//MindfulnessExerciseAttempt holds information about each attempt the user has
public class MindfulnessExerciseAttempt extends ExerciseAttempt {

	private String type;
	public MindfulnessExerciseAttempt(int aattemptNumber, String t) {
		super(aattemptNumber);
		this.type = t;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//firebase empty constructor
	public MindfulnessExerciseAttempt() {
		super(0);
	}
	

}