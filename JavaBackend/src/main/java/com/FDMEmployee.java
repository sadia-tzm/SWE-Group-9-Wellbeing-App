package com;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Shannon
 */
public class FDMEmployee extends User {

	private ArrayList<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	HealthHistory health;
	private ArrayList<AmbientSounds> ambientSoundExercises;
	private ArrayList<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	private LocalDateTime dateOfBirth;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;


	/**
	 *constructor
	 */
	public FDMEmployee(String nname, String userName, String email, LocalDateTime ddate, int height, int weight) {
		//String nname, String ppassword, String uuserName, String eemail, String iid
		super(nname, userName, email);
		this.dateOfBirth = ddate;
		this.health = new HealthHistory(height, weight);
		mindfulnessExerciseAttempts = new ArrayList<MindfulnessExerciseAttempt>() ;
		ambientSoundExercises = new ArrayList<AmbientSounds>();
		workoutExcerciseAttempts = new ArrayList<WorkoutExcerciseAttempt>();
		//TODO targets
	}


	/**
	 *
	 * @param availableMindfulnessExercise
	 */
	public void attemptMindfulnessExercise(String type) {
		MindfulnessExerciseAttempt attempt;
		attempt = new MindfulnessExerciseAttempt(mindfulnessExerciseAttempts.size()+1, type);
		this.mindfulnessExerciseAttempts.add(attempt);
	}


	/**
	 *
	 * returns a set of statistics for the employee
	 */
	public String viewStatistics() {
		 String stats = "\n";
		 // TODO implement stats

		System.out.println(stats);
		return stats;
	}

	/**
	 * deletes the excercise attempt
	 * @param exerciseAttempt
	 */
	public void deleteExerciseAttempt(ExerciseAttempt exerciseAttempt) {
		this.workoutExcerciseAttempts.remove(exerciseAttempt);
		this.mindfulnessExerciseAttempts.remove(exerciseAttempt);

	}
	

	/**
	 *
	 * @param ExerciseAttempt the activity to be edited
	 * @param newDuration the new time the activity actually took
	 * @param newSteps if the attempt is a step excercise, this parameter represents the new amount of steps taken.
	 */
	public void editWorkoutExerciseAttempt(WorkoutExcerciseAttempt exerciseAttempt, int newval) {
		//change duration????? how can i change duration ithout changing end time.... or should I make a new object with adjusted end time????

		exerciseAttempt.editEntry(newval);

	}

	/**
	 *
	 * @param ExerciseAttempt the activity to be changed
	 * @param newDuration  the new time the activity actually took
	 */
	public void editMindfulnessExercise(MindfulnessExerciseAttempt ExerciseAttempt, long newDuration) {//breathing ex didnt seem different
		ExerciseAttempt.editEntry(newDuration, LocalDateTime.now());
	}

	/**
	 * 
	 * @return the users health info
	 */
	public HealthHistory getHealthHistory() {//breathing ex didnt seem different
		return this.health;
	}


	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!
	
	public FDMEmployee() {
		//empty constructor for firebase
	}

	//the rest are basic getters and setters for all variables that don't have them!

	public ArrayList<MindfulnessExerciseAttempt> getMindfulnessExerciseAttempts() {
		return this.mindfulnessExerciseAttempts;
	}

	public void setMindfulnessExerciseAttempts(ArrayList<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts) {
		this.mindfulnessExerciseAttempts = mindfulnessExerciseAttempts;
	}

	public void setHealthHistory(HealthHistory health) {
		this.health = health;
	}

	public ArrayList<AmbientSounds> getAmbientSoundExercises() {
		return this.ambientSoundExercises;
	}

	public void setAmbientSoundExercises(ArrayList<AmbientSounds> ambientSoundExercises) {
		this.ambientSoundExercises = ambientSoundExercises;
	}

	public ArrayList<WorkoutExcerciseAttempt> getWorkoutExcerciseAttempts() {
		return this.workoutExcerciseAttempts;
	}

	public void setWorkoutExcerciseAttempts(ArrayList<WorkoutExcerciseAttempt> workoutExcerciseAttempts) {
		this.workoutExcerciseAttempts = workoutExcerciseAttempts;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth.format(formatter);
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = LocalDateTime.parse(dateOfBirth, formatter);
	}
}
	//----------------------------------------------------------------------------------------------------------------------------------------
