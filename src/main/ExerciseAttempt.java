package main;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Instant;

public abstract class ExerciseAttempt {

	private LocalDateTime dateCompleted;
	private long duration;
	private int attemptNumber;
	private Instant startTime;
	private Instant endTime;

	public ExerciseAttempt() {
		this.startTime = Instant.now();
	}

	public Boolean completeAttempt(int dduration, int aattemptNumber) {
		this.dateCompleted = LocalDateTime.now();
		this.attemptNumber = aattemptNumber;
		this.endTime = Instant.now();
		this.duration = (Duration.between(startTime, endTime)).toMillis();
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getDateCompleted() {
		return this.dateCompleted;
	}

	public long getDuration() {
		return this.duration;
	}

	public boolean editEntry(long dduration) {
		this.duration = dduration;
		throw new UnsupportedOperationException();
	}

}