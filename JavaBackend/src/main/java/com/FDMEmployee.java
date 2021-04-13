package com;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FDMEmployee extends User {

	private ArrayList<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	private HealthHistory health;
	private ArrayList<AmbientSounds> ambientSoundExercises;
	private ArrayList<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	private LocalDateTime dateOfBirth;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;


	/**
	 *
	 */
	public FDMEmployee(String nname, String userName, String email, String iid, LocalDateTime ddate, int height, int weight) {
		//String nname, String ppassword, String uuserName, String eemail, String iid
		super(nname, userName, email, iid);
		this.dateOfBirth = ddate;
		this.health = new HealthHistory(height, weight);
		mindfulnessExerciseAttempts = new ArrayList<MindfulnessExerciseAttempt>() ;
		ambientSoundExercises = new ArrayList<AmbientSounds>();
		workoutExcerciseAttempts = new ArrayList<WorkoutExcerciseAttempt>();
		//TODO targets
		// targets = new ArrayList<Target>();
	}


	/**
	 *
	 * @param availableMindfulnessExercise
	 */
	public void attemptMindfulnessExercise(MindfulnessExercise availableMindfulnessExercise) {
		MindfulnessExerciseAttempt attempt;
		if (availableMindfulnessExercise instanceof BreathingExercise){
			attempt = new BreathingExerciseAttempt(mindfulnessExerciseAttempts.size()+1, (BreathingExercise)availableMindfulnessExercise);
		} else {
			attempt = new MindfulnessExerciseAttempt(mindfulnessExerciseAttempts.size()+1, availableMindfulnessExercise);
		}
		this.mindfulnessExerciseAttempts.add(attempt);
	}

	/**
	 *
	 * @param availableWorkoutExercise the excercise the user is attempted / to be added as a reference in the ne wobject
	 */
	public void attemptWorkoutExercise(WorkoutExercise availableWorkoutExercise) {
		WorkoutExcerciseAttempt attempt; //const
		//if (availableWorkoutExercise instanceof StepExercise){
			//attempt = new StepExerciseAttempt(workoutExcerciseAttempts.get(workoutExcerciseAttempts.size()-1).getAttemptNumber()+1, availableWorkoutExercise);
		// TODO step ex constructor
			//attempt = new StepExerciseAttempt(availableWorkoutExercise); //step ex constructor

		attempt = new WorkoutExcerciseAttempt(0, availableWorkoutExercise, workoutExcerciseAttempts.size()+1);
		this.workoutExcerciseAttempts.add(attempt);
	}

	/**
	 *
	 * returns a set of statistics for the employee
	 */
	public String viewStatistics() {
		String stats = "\n";
		//throw new UnsupportedOperationException();
		stats+= Double.toString(this.health.getCurrentBMI());
		stats+= " - current BMI: " + this.health.getCurrentBMIStatus(this.health.getCurrentBMI())+"\n";
		stats+= Integer.toString(health.getCurrentHeight().getHeight());//get current height shoul
		stats+= " - current height\n";
		stats+= Integer.toString(health.getCurrentWeight().getWeight());
		stats+= " - current weight\n";
		//potential averages or something?

		if (mindfulnessExerciseAttempts != null) for (MindfulnessExerciseAttempt m : mindfulnessExerciseAttempts) {
			stats+=("attempt number - " + Integer.toString(m.getAttemptNumber()) +"duration - " + Long.toString(m.getDuration()) +"name - "
			+ m.getExercise().getExerciseName()+ "Date" + m.getDateLogged().toString()+"\n");
		}

		if (workoutExcerciseAttempts != null) for (WorkoutExcerciseAttempt w : workoutExcerciseAttempts) {
			stats+=("attempt number - " + Integer.toString(w.getAttemptNumber()) +"duration - " + Long.toString(w.getDuration()) +"name - "
			+ w.getExercise().getExerciseName()+ "Date" + w.getDateLogged().toString());
			stats+="\n";
		}

		/**
		 * this.mentalHealthAmbassador = mmentalHealthAmbassador;
		this.fdmEmployee = ffdmEmployee;
		this.exercise = eexercise;
		this.attribute = aattribute;
		this.value = vvalue;
		ismet
		 * */
		 // TODO implement targets
		// for (Target t : targets) {
		// 	stats+=("Name - "+t.getExercise().getName()+ "attribute" +t.getAttribute()+ "value " +Integer.toString(t.getValue()));
		// 	stats+= (t.targetMet(); ? "target Met!" : "target not yet met");//setters for targets
		// }

		//looping attempt ist....
		//targets acheived
		//how am I to get the targets as theres no list....
		//add list of targers -
		//getter for list and setter - add another
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

	//----------------------------------------------------------------------------------------------------------------------------------------


	
	// TODO implement appointemnt
	// /**
	//  *
	//  * @param mentalHealthAmbassador the mental health ambassador that the appointment will be with
	//  * @param booking the timeslot that contains the time that the appointment will be at
	//  */
	// public void bookAppointment(MentalHealthAmbassador mentalHealthAmbassador, TimeSlot booking) {
	// 	Appointment app = new Appointment(mentalHealthAmbassador, this, booking.getDateandTime());
	// 	appointments.add(app);

	// }

	// /**
	//  * cancels an appointment
	//  * @param appointment the appointment to be cancelled.
	//  */
	// public void cancelAppointment(Appointment appointment) {
	// 	appointments.remove(appointment);
	// 	Inventory.getInstance().getListOfUsers().remove(appointment);
	// }

	// /**
	//  *
	//  * @param appointment the appoiintment to be scheduled.
	//  * @param newbooking the timeslot that contains the time that the appointment will now be at
	//  */
	// public void rescheduleAppointment(Appointment appointment, TimeSlot newbooking) {
	// 	appointment.setTimeslot(newbooking); // add to appointment / timeslot????
	// }

	// TODO Targets
	//public ArrayList<Target> getTargets() {
	//	return targets;
	//}

}
