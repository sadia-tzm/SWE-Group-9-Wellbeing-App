public abstract class ExerciseAttempt {

	private LocalDateTime dateCompleted;
	private int duration;
	private int attemptNumber;

	/**
	 * 
	 * @param ddateCompleted
	 * @param dduration
	 * @param aattemptNumber
	 */
	public Boolean completeAttempt(LocalDateTime ddateCompleted, int dduration, int aattemptNumber) {
		// TODO - implement ExerciseAttempt.completeAttempt
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getDateCompleted() {
		return this.dateCompleted;
	}

	public int getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param duration
	 */
	public boolean editEntry(int duration) {
		// TODO - implement ExerciseAttempt.editEntry
		throw new UnsupportedOperationException();
	}

	public boolean deleteEntry() {
		// TODO - implement ExerciseAttempt.deleteEntry
		throw new UnsupportedOperationException();
	}

}