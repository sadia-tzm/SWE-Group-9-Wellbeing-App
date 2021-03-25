package main;
import java.util.*;
import java.time.*; 


import jdk.jfr.Enabled;

public class FDMEmployee extends User {

<<<<<<< Updated upstream
	ArrayList<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	//ArrayList<Appointment> appointments;
	HealthHistory health;
	ArrayList<AmbientSounds> ambientSoundExercises;
	ArrayList<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	ArrayList<Target> targets;
=======
	Collection<MindfulnessExerciseAttempt> mindfulnessExerciseAttempts;
	Collection<Appointment> appointments;
	HealthHistory health;
	Collection<AmbientSounds> ambientSoundExercises;
	Collection<WorkoutExcerciseAttempt> workoutExcerciseAttempts;
	Collection<Target> targets;
>>>>>>> Stashed changes
	LocalDateTime dateOfBirth;
	Boolean sex; //true for male


	/**
	 * 
	 */
	public FDMEmployee(String nname, Boolean sx, String password, String userName, String email, LocalDateTime ddate, Height height, Weight weight) {
		super(nname, password, userName, email);
		dateOfBirth = ddate;
		sex = sx;
		health = new HealthHistory(height, weight);//health remove void
<<<<<<< Updated upstream
		mindfulnessExerciseAttempts = new ArrayList<MindfulnessExerciseAttempt>() ;
		ambientSoundExercises = new ArrayList<AmbientSounds>();
		workoutExcerciseAttempts = new ArrayList<WorkoutExcerciseAttempt>();
		targets = new ArrayList<Target>();
	}

=======
	}
>>>>>>> Stashed changes
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

	public int getBMI() {
		return 1;
	}

	/**
	 * 
	 * @param availableMindfulnessExercise
	 */
	public void attemptMindfulnessExercise(MindfulnessExercise availableMindfulnessExercise) {
		MindfulnessExerciseAttempt attempt;
		if (availableMindfulnessExercise instanceof BreathingExercise){
			attempt = new BreathingExerciseAttempt(mindfulnessExerciseAttempts.toArray()[mindfulnessExerciseAttempts.size()-1].getAttemptNumber()+1, availableMindfulnessExercise);
		} else {
			attempt = new MindfulnessExerciseAttempt(mindfulnessExerciseAttempts.toArray()[mindfulnessExerciseAttempts.size()-1].getAttemptNumber()+1, availableMindfulnessExercise);
		}
		mindfulnessExerciseAttempts.add(attempt);
	}

	/**
	 *
	 * @param availableWorkoutExercise the excercise the user is attempted / to be added as a reference in the ne wobject
	 */
	public void attemptWorkoutExercise(WorkoutExercise availableWorkoutExercise) {
		WorkoutExcerciseAttempt attempt; //const
		if (availableWorkoutExercise instanceof StepExercise){
			attempt = new StepExerciseAttempt(workoutExcerciseAttempts.get(workoutExcerciseAttempts.size()-1).getAttemptNumber()+1, availableWorkoutExercise);
		} else {
			attempt = new WorkoutExerciseAttempt(workoutExcerciseAttempts.get(workoutExcerciseAttempts.size()-1).getAttemptNumber()+1, availableWorkoutExercise);
		}
		workoutExcerciseAttempts.add(attempt);
	}

	/**
	 * 
	 * returns a set of statistics for the employee
	 */
	public String viewStatistics() {
		String stats = "";
		throw new UnsupportedOperationException();
		stats += Integer.toString(this.getBMI());
		stats+= " - current BMI \n";
		stats+= Integer.toString(health.getCurrentHeight().getHeight());//get current height shoulf
		stats+= " - current height \n";
		stats+= Integer.toString(health.getCurrentWeight().getWeight());
		stats+= " - current weight \n";
		//potential averages or something?
		 
		for (MindfulnessExerciseAttempt m : mindfulnessExerciseAttempts) {
			stats+=("attempt number - " + Integer.toString(m.getAttemptNumber()) +"duration - " + Long.toString(m.getDuration()) +"name - "
			+ m.getExercise().getName()+ "Date" + m.getDateLogged().toString()+"\n");
		}

		for (WorkoutExcerciseAttempt w : workoutExcerciseAttempts) {
			stats+=("attempt number - " + Integer.toString(w.getAttemptNumber()) +"duration - " + Long.toString(w.getDuration()) +"name - "
			+ w.getExercise().getName()+ "Date" + w.getDateLogged().toString()+);
			if (w instanceof StepExerciseAttempt){
				stats+= (Integer.toString((StepExerciseAttempt) w.getSteps()));//???
			}
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
		for (Target t : targets) {
			stats+=("Name - "+t.getExercise().getName()+ "attribute" +t.getAttribute()+ "value " +Integer.toString(t.getValue()));
			stats+= (t.targetMet(); ? "target Met!" : "target not yet met");//setters for targets
		}

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
		workoutExcerciseAttempts.remove(exerciseAttempt);
		mindfulnessExerciseAttempts.remove(exerciseAttempt);

	}

	public ArrayList<Target> getTargets() {
		return targets;
	}

	/**
	 * 
	 * @param ExerciseAttempt the activity to be edited
	 * @param newDuration the new time the activity actually took 
	 * @param newSteps if the attempt is a step excercise, this parameter represents the new amount of steps taken.
	 */
	public boolean editWorkoutExerciseAttempt(WorkoutExcerciseAttempt exerciseAttempt, long newDuration, int newSteps) {
		//change duration????? how can i change duration ithout changing end time.... or should I make a new object with adjusted end time????
		if(exerciseAttempt instanceof StepExerciseAttempt){
			exerciseAttempt.editEntry(newDuration, newSteps);//supposed to be long
		} else{
			exerciseAttempt.editEntry(newDuration, LocalDateTime.now());
		}
		
	}

	/**
	 * 
	 * @param ExerciseAttempt the activity to be changed
	 * @param newDuration  the new time the activity actually took 
	 */
	public void editMindfulnessExercise(MindfulnessExerciseAttempt ExerciseAttempt, long newDuration) {//breathing ex didnt seem different

		ExerciseAttempt.editEntry(newDuration, LocalDateTime.now());
	}

}