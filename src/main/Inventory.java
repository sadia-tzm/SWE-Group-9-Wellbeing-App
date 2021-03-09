import java.util.*;

public class Inventory {

	Collection<User> listOfUsers;
	Collection<Appointment> appointments;
	Collection<TimeSlot> weekSchedule;
	Collection<WorkoutExercise> availableWorkoutExercises;
	Collection<MindfulnessExercise> availableMindfulnessExercises;
	Collection<Query> queries;
	private static Inventory inventory;
	private List<String> workoutDifficulties;
	private List<String> statusList;
	private List<String> targetAttribute;

	private void Inventory() {
		// TODO - implement Inventory.Inventory
		throw new UnsupportedOperationException();
	}

	public static Inventory getInstance() {
		// TODO - implement Inventory.getInstance
		throw new UnsupportedOperationException();
	}

	public List<User> getListOfUsers() {
		// TODO - implement Inventory.getListOfUsers
		throw new UnsupportedOperationException();
	}

	public List<TimeSlot> getWeekSchedule() {
		// TODO - implement Inventory.getWeekSchedule
		throw new UnsupportedOperationException();
	}

	public List<MindfulnessExercise> getAvailableMindfulnessExercises() {
		// TODO - implement Inventory.getAvailableMindfulnessExercises
		throw new UnsupportedOperationException();
	}

	public List<WorkoutExercises> getAvailableWorkoutExercises() {
		// TODO - implement Inventory.getAvailableWorkoutExercises
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param difficulty
	 */
	public String getWorkoutDifficulty(int difficulty) {
		// TODO - implement Inventory.getWorkoutDifficulty
		throw new UnsupportedOperationException();
	}

	public List<String> getTargetAttribute() {
		return this.targetAttribute;
	}

	/**
	 * 
	 * @param newWeekSchedule
	 */
	public boolean setWeekSchedule(List<TimeSlot> newWeekSchedule) {
		// TODO - implement Inventory.setWeekSchedule
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newWorkoutDifficulties
	 */
	public boolean setWorkoutDifficulties(List<String> newWorkoutDifficulties) {
		// TODO - implement Inventory.setWorkoutDifficulties
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newStatusList
	 */
	public boolean setStatusList(List<String> newStatusList) {
		// TODO - implement Inventory.setStatusList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newTargetTypes
	 */
	public boolean setTargetTypes(List<String> newTargetTypes) {
		// TODO - implement Inventory.setTargetTypes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newTargetProperties
	 */
	public boolean setTargetProperties(List<String> newTargetProperties) {
		// TODO - implement Inventory.setTargetProperties
		throw new UnsupportedOperationException();
	}

}