package main;
import java.util.*;

public class FDMEmployee extends User {

	Collection<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	Collection<Appointment> appointments;
	Health health;
	Collection<AmbientSounds> ambientSoundExercises;
	Collection<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	private int age;

	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 * @param aage
	 * @param height
	 * @param weight
	 */
	public boolean FDMEmployee(String nname, String password, String userName, String email, int aage, int height, int weight) {
		// TODO - implement FDMEmployee.FDMEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mentalHealthAmbassador
	 * @param booking
	 */
	public void bookAppointment(MentalHealthAmbassador mentalHealthAmbassador, TimeSlot booking) {
		// TODO - implement FDMEmployee.bookAppointment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param appointment
	 */
	public void cancelAppointment(Appointment appointment) {
		// TODO - implement FDMEmployee.cancelAppointment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param appointment
	 */
	public void rescheduleAppointment(Appointment appointment) {
		// TODO - implement FDMEmployee.rescheduleAppointment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param availableMindfulnessExercise
	 */
	public void attemptMindfulnessExercise(MindfulnessExercise availableMindfulnessExercise) {
		// TODO - implement FDMEmployee.attemptMindfulnessExercise
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param availableWorkoutExercise
	 */
	public void attemptWorkoutExercise(WorkoutExercise availableWorkoutExercise) {
		// TODO - implement FDMEmployee.attemptWorkoutExercise
		throw new UnsupportedOperationException();
	}

	public String viewStatistics() {
		// TODO - implement FDMEmployee.viewStatistics
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param exerciseAttempt
	 */
	public boolean deleteExerciseAttempt(ExerciseAttempt exerciseAttempt) {
		// TODO - implement FDMEmployee.deleteExerciseAttempt
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mindfulnessExerciseAttempt
	 */
	public boolean editMindfulnessExerciseAttempt(MindfulnessExerciseAttempt mindfulnessExerciseAttempt) {
		// TODO - implement FDMEmployee.editMindfulnessExerciseAttempt
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param workoutExerciseAttempt
	 */
	public boolean editWorkoutExercise(WorkoutExerciseAttempt workoutExerciseAttempt) {
		// TODO - implement FDMEmployee.editWorkoutExercise
		throw new UnsupportedOperationException();
	}

}