package main;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;

public abstract class ExerciseAttempt {

	//-------------------------------------------------------------------------------
	//declaring class variables
	private LocalDateTime dateCompleted;
	private LocalDateTime dateLogged;
	private long duration;
	private int attemptNumber;
	private Instant startTime;
	private Instant endTime;
	private Exercise exercise;

	//-------------------------------------------------------------------------------
	//gets attemptNumber from the length of the exercise attempt list
	public ExerciseAttempt(int aattemptNumber, Exercise eexercise) {
		this.startTime = Instant.now();
		this.attemptNumber = aattemptNumber;
		this.exercise = eexercise;
	}

	//-------------------------------------------------------------------------------
	//the user chooses between manually entering the results or based on a timer:

	//completing based on a timer
	public Boolean completeAttempt() {
		this.dateCompleted = LocalDateTime.now();
		this.endTime = Instant.now();
		this.duration = (Duration.between(startTime, endTime)).toMillis();
		return true;
	}

	//completing by manually entering results
	public Boolean completeAttempt(long dduration, LocalDateTime ddateCompleted) {
		this.dateCompleted = ddateCompleted;
		this.duration = dduration;
		return true;
	}

	//-------------------------------------------------------------------------------
	//getters:

	public LocalDateTime getDateCompleted() {
		return this.dateCompleted;
	}

	public int getAttemptNumber() {
		return this.attemptNumber;
	}

	public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

	public long getDuration() {
		return this.duration;
	}

	public Exercise getExercise() {
		return this.exercise;
	}

	//-------------------------------------------------------------------------------
	//manually editing the entry:
	public boolean editEntry(long dduration, LocalDateTime ddateCompleted) {
		this.dateCompleted = ddateCompleted;
		this.duration = dduration;
		return true;
	}

}