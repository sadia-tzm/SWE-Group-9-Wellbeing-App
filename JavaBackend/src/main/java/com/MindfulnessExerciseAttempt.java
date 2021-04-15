package com;
public class MindfulnessExerciseAttempt extends ExerciseAttempt {

	//private MindfulnessExercise mindfulnessExercise;
	private String type;
	//public MindfulnessExerciseAttempt(int aattemptNumber, MindfulnessExercise mmindfulnessExercise) {
	public MindfulnessExerciseAttempt(int aattemptNumber, String t) {
		//super(aattemptNumber, mmindfulnessExercise);
		super(aattemptNumber);
		this.type = t;
		//this.mindfulnessExercise = mmindfulnessExercise;
	}

	// public MindfulnessExercise getMindfulnessExercise(){
	// 	return this.mindfulnessExercise;
	// }

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