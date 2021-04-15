package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//this is exercise attempt, to log attempts of any kind of exercise by the FDM employee
public abstract class ExerciseAttempt {

	//-------------------------------------------------------------------------------
	//declaring class variables
	//
	private LocalDateTime dateCompleted;
	private int attemptNumber;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

	//-------------------------------------------------------------------------------
	//gets attemptNumber from the length of the exercise attempt list
	public ExerciseAttempt(int aattemptNumber) {
		this.attemptNumber = aattemptNumber;
		this.dateCompleted = LocalDateTime.now();
	}


	//-------------------------------------------------------------------------------
	//getters:

	public String getDateCompleted() {
		return this.dateCompleted.format(formatter);
	}

	public int getAttemptNumber() {
		return this.attemptNumber;
	}

	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = LocalDateTime.parse(dateCompleted, formatter);
	}

	public void setAttemptNumber(int attemptNumber) {
		this.attemptNumber = attemptNumber;
	}




	//-------------------------------------------------------------------------------
	//manually editing the entry:
	public boolean editEntry(long dduration, LocalDateTime ddateCompleted) {
		this.dateCompleted = ddateCompleted;
		//this.duration = dduration;
		return true;
	}

}