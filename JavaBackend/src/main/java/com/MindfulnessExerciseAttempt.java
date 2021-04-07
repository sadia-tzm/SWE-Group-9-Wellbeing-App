package com;
public class MindfulnessExerciseAttempt extends ExerciseAttempt {


	private MindfulnessExercise mindfulnessExercise;

	public MindfulnessExerciseAttempt(int aattemptNumber, MindfulnessExercise mmindfulnessExercise) {
		super(aattemptNumber, mmindfulnessExercise);
		this.mindfulnessExercise = mmindfulnessExercise;
	}

	public MindfulnessExercise getMindfulnessExercise(){
		return this.mindfulnessExercise;
	}
	

}