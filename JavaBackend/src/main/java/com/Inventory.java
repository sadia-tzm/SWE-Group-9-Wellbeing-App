package com;

import java.util.Collection;
import java.util.List;

import com.extra.Appointment;
import com.extra.Query;

public class Inventory {

	Collection<User> listOfUsers;
	Collection<Appointment> appointments;
	Collection<TimeSlot> weekSchedule;
	Collection<WorkoutExercise> availableWorkoutExercises;
	Collection<MindfulnessExercise> availableMindfulnessExercises;
	Collection<Query> queries;
	private static Inventory inventory = null;
	private List<String> workoutDifficulties;
	private List<String> statusList;
	private List<String> targetAttribute;
	private String currentTask;

	private void Inventory() {
		this.currentTask = null;
	}
	public static Inventory getInstance() {
        if (inventory == null)
			inventory = new Inventory();
        return inventory;
    }

	public String getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(String currentTask) {
		this.currentTask = currentTask;
	}

	//TODO - complete inventory

	// public static Inventory getInstance() {
	// }

	// public List<User> getListOfUsers() {
	// }

	// public List<TimeSlot> getWeekSchedule() {
	// }

	// public List<MindfulnessExercise> getAvailableMindfulnessExercises() {
	// }

	// public List<WorkoutExercises> getAvailableWorkoutExercises() {
	// }

	// public String getWorkoutDifficulty(int difficulty) {
	// }

	// public List<String> getTargetAttribute() {
	// 	return this.targetAttribute;
	// }

	// public boolean setWeekSchedule(List<TimeSlot> newWeekSchedule) {
	// }

	// public boolean setWorkoutDifficulties(List<String> newWorkoutDifficulties) {
	// }

	// public boolean setStatusList(List<String> newStatusList) {
	// }

	// public boolean setTargetTypes(List<String> newTargetTypes) {
	// }

	// public boolean setTargetProperties(List<String> newTargetProperties) {
	// }


	


}