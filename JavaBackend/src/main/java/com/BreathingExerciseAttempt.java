package com;
public class BreathingExerciseAttempt extends MindfulnessExerciseAttempt {

	private BreathingExercise breathingExercise;

	public BreathingExerciseAttempt(int aattemptNumber, BreathingExercise bbreathingExercise) {
		super(aattemptNumber, bbreathingExercise);
		this.breathingExercise = bbreathingExercise;
	}

	public BreathingExercise getBreathingExercise(){
		return this.breathingExercise;
	}
	

}