//framework for unused class MindfulnessExercise:


//--------------------------------------------------------

package com.extra;

public abstract class MindfulnessExercise extends Exercise {

	private String soundPath;

	public MindfulnessExercise(String eexerciseName, String ssoundPath) {
		super(eexerciseName);
		this.soundPath = ssoundPath;
	}

	public String getSoundPath() {
		return this.soundPath;
	}

}