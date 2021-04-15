//framework for unused class BreathingExercise:


//--------------------------------------------------------


package com.extra;

public class BreathingExercise extends MindfulnessExercise {

	private int tempo;

	public BreathingExercise(String eexerciseName, String ssoundPath, int ttempo) {
		super(eexerciseName, ssoundPath);
		this.tempo = ttempo;
	}

	public int getTempo() {
		return this.tempo;
	}
}