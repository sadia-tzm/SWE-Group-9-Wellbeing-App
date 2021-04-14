package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class ExerciseAttempt {

	//-------------------------------------------------------------------------------
	//declaring class variables
	private LocalDateTime dateCompleted;
	//private LocalDateTime dateLogged;
	//private long duration;
	private int attemptNumber;
	//private Instant startTime;
	//private Instant endTime;
	//private Exercise exercise;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

	//-------------------------------------------------------------------------------
	//gets attemptNumber from the length of the exercise attempt list
	//public ExerciseAttempt(int aattemptNumber, Exercise eexercise) {
	public ExerciseAttempt(int aattemptNumber) {
		//this.startTime = Instant.now();
		this.attemptNumber = aattemptNumber;
		this.dateCompleted = LocalDateTime.now();
		//this.exercise = eexercise;
	}

	//-------------------------------------------------------------------------------
	//the user chooses between manually entering the results or based on a timer:

	//completing based on a timer
	// public Boolean completeAttempt() {
	// 	this.dateCompleted = LocalDateTime.now();
	// 	this.endTime = Instant.now();
	// 	this.duration = (Duration.between(startTime, endTime)).toMillis();
	// 	return true;
	// }

	//completing by manually entering results
	// public Boolean completeAttempt(long dduration, LocalDateTime ddateCompleted) {
	// 	this.dateCompleted = ddateCompleted;
	// 	this.duration = dduration;
	// 	return true;
	// }

	//-------------------------------------------------------------------------------
	//getters:

	public String getDateCompleted() {
		return this.dateCompleted.format(formatter);
	}

	public int getAttemptNumber() {
		return this.attemptNumber;
	}

	// public LocalDateTime getDateLogged() {
	// 	return this.dateLogged;
	// }

	// public long getDuration() {
	// 	return this.duration;
	// }

	// public Exercise getExercise() {
	// 	return this.exercise;
	// }
	public void setDateCompleted(String dateCompleted) {
		this.dateCompleted = LocalDateTime.parse(dateCompleted, formatter);
	}
	// public void setDateLogged(LocalDateTime dateLogged) {
	// 	this.dateLogged = dateLogged;
	// }
	// public void setDuration(long duration) {
	// 	this.duration = duration;
	// }
	public void setAttemptNumber(int attemptNumber) {
		this.attemptNumber = attemptNumber;
	}

	// public Instant getStartTime() {
	// 	return this.startTime;
	// }

	// public void setStartTime(Instant startTime) {
	// 	this.startTime = startTime;
	// }

	// public Instant getEndTime() {
	// 	return this.endTime;
	// }

	// public void setEndTime(Instant endTime) {
	// 	this.endTime = endTime;
	// }
	// public void setExercise(Exercise exercise) {
	// 	this.exercise = exercise;
	// }


	//-------------------------------------------------------------------------------
	//manually editing the entry:
	public boolean editEntry(long dduration, LocalDateTime ddateCompleted) {
		this.dateCompleted = ddateCompleted;
		//this.duration = dduration;
		return true;
	}

}