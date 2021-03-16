package main;
import java.util.*;
import java.time.*; 


import jdk.jfr.Enabled;

public class FDMEmployee extends User {

	Collection<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	Collection<Appointment> appointments;
	Health health;
	Collection<AmbientSounds> ambientSoundExercises;
	Collection<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	LocalDateTime dateOfBirth;

	/**
	 * 
	 */
	public FDMEmployee(String nname, String password, String userName, String email, LocalDateTime ddate, int height, int weight) {
		super(nname, password, userName, email);
		dateOfBirth = ddate;
		health = new Health(height, weight);
	}

	/**
	 * 
	 * @param mentalHealthAmbassador the mental health ambassador that the appointment will be with
	 * @param booking the timeslot that contains the time that the appointment will be at
	 */
	public void bookAppointment(MentalHealthAmbassador mentalHealthAmbassador, TimeSlot booking) {
		Appointment app = new Appointment(mentalHealthAmbassador, this, booking.getDateandTime());
		appointments.add(app);


	}

	/**
	 * cancels an appointment
	 * @param appointment the appointment to be cancelled.
	 */
	public void cancelAppointment(Appointment appointment) {
		appointments.remove(appointment);
		Inventory.getInstance().getListOfUsers().remove(appointment);
	}

	/**
	 * 
	 * @param appointment the appoiintment to be scheduled.
	 * @param newbooking the timeslot that contains the time that the appointment will now be at
	 */
	public void rescheduleAppointment(Appointment appointment, TimeSlot newbooking) {
		appointment.setTimeslot(newbooking); // add to appointment / timeslot????
	}

	/**
	 * 
	 * @param availableMindfulnessExercise
	 */
	public void attemptMindfulnessExercise(MindfulnessExercise availableMindfulnessExercise) {
		MindfulnessExerciseAttempt attempt = new MindfulnessExcerciseAttempt(availableMindfulnessExercise);
		mindfulnessExerciseAttempts.add(attempt);
	}

	/**
	 * 
	 * @param availableWorkoutExercise the excercise the user is attempted / to be added as a reference in the ne wobject
	 */
	public void attemptWorkoutExercise(WorkoutExercise availableWorkoutExercise) {
		WorkoutExerciseAttempt attempt = new WorkoutExcerciseAttempt(availableWorkoutExercise);
		mindfulnessExerciseAttempts.add(attempt);
	}

	/**
	 * 
	 * @param availableWorkoutExercise the excercise the user is attempted / to be added as a reference in the ne wobject
	 */
	public void attemptStep(WorkoutExercise availableWorkoutExercise) {
		WorkoutExerciseAttempt attempt = new WorkoutExcerciseAttempt(availableWorkoutExercise);
		mindfulnessExerciseAttempts.add(attempt);
	}


	/**
	 * 
	 * returns a set of statistics for the employee
	 */
	public String viewStatistics() {
		String stats = "";
		throw new UnsupportedOperationException();
		stats += ToString(health.getBMI());
		stats+= " - current BMI \n";
		stats+= toString(health.getCurrentHeight());
		stats+= " - current height \n";
		stats+= toString(health.getCurrentWeight());
		stats+= " - current weight \n";


		//looping attempt ist....
		//targets acheived 
		//how am I to get the targets as theres no list....
		//add list of targers - 
		//getter for list and setter - add another 
		return stats;
	}

	/**
	 * deletes the excercise attempt
	 * @param exerciseAttempt
	 */
	public boolean deleteExerciseAttempt(ExerciseAttempt exerciseAttempt) {
		workoutExcerciseAttempts.remove(exerciseAttempt);
		mindfulnessExerciseAttempts.remove(exerciseAttempt);

	}

	/**
	 * 
	 * @param ExerciseAttempt the activity to be edited
	 * @param newDuration the new time the activity actually took 
	 * @param newSteps if the attempt is a step excercise, this parameter represents the new amount of steps taken.
	 */
	public boolean editWorkoutExerciseAttempt(WorkoutExerciseAttempt ExerciseAttempt, long newDuration, int newSteps) {
		//change duration????? how can i change duration ithout changing end time.... or should I make a new object with adjusted end time????
		if(mindfulnessExerciseAttempt instanceof StepExerciseAttempt){
			mindfulnessExerciseAttempt.editEntry(newDuration, newSteps);
		} else{
			mindfulnessExerciseAttempt.editEntry(newDuration);
		}
		
	}

	/**
	 * 
	 * @param ExerciseAttempt the activity to be changed
	 * @param newDuration  the new time the activity actually took 
	 */
	public boolean editMindfulnessExercise(MindfulnessExerciseAttempt ExerciseAttempt, long newDuration) {

		mindfulnessExerciseAttempt.editEntry(newDuration);
	}

}