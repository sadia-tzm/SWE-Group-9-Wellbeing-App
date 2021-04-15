//framework for unused class StepExercise:


//--------------------------------------------------------

package com.extra;

public class StepExerciseAttempt extends WorkoutExcerciseAttempt {

	private int stepsTaken;
	private int duration;

	public StepExerciseAttempt(int ccaloriesBurnt, WorkoutExercise wworkoutExercise, int aattemptNumber) {
		super(ccaloriesBurnt, wworkoutExercise, aattemptNumber);
	}


	public void setSteps(int sstepsTaken) {
		this.stepsTaken = sstepsTaken;
	}

	public int getSteps() {
		return this.stepsTaken;
	}

	public void addSteps(int additionalSteps) {
		this.stepsTaken += additionalSteps;
	}

	public void editEntry(int newDuration, int newStepsTaken) {
		this.stepsTaken = newStepsTaken;
		this.duration = newDuration;
	}

}