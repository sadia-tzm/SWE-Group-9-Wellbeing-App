package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

import com.extra.Appointment;
import com.extra.Query;
import com.firebaseStuff.FirebaseDatabase;
import com.firebaseStuff.SetupAccount;
import com.google.cloud.firestore.DocumentSnapshot;

public class Inventory {
	
	private static Inventory inventory = null;
	private Collection<User> listOfUsers;
	private Collection<Appointment> appointments;
	private Collection<TimeSlot> weekSchedule;
	private Collection<WorkoutExercise> availableWorkoutExercises;
	private Collection<MindfulnessExercise> availableMindfulnessExercises;
	private Collection<Query> queries;
	private List<String> workoutDifficulties;
	private List<String> statusList;
	private List<String> targetAttribute;
	private String currentTask;
	private FirebaseDatabase fbdb;
	private FDMEmployee currentFDMEmployee;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

	private Inventory() throws InterruptedException{
		this.fbdb = FirebaseDatabase.fbdbGetInstance();
		this.fbdb.eventTrigger();
		this.currentTask = null;
	}

	public static Inventory getInstance() throws InterruptedException {
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

	public void completeTask() {
		String task = this.currentTask;
		this.currentTask = null;
		switch(task) {
			case "setupAccount":
				setupAccount();
				break;
			case "findEmail":
				findEmail();
				break;
			case "addCalories":
				addCalories();
				break;
			case "searchFood":
				searchFood();
				break;
			case "getTotalCalories":
				getTotalCalories();
				break;
			case "editCalories":
				editCalories();
				break;
			case "updateBMI":
				updateBMI();
				break;
			case "getBMI":
				getBMI();
				break;
			case "getBMIHistory":
				getBMIHistory();
				break;
			case "logout":
				logout();
				break;
			default:
				break;
		}
	}
	
	private void setupAccount(){
		DocumentSnapshot document = fbdb.getItems("communications", "setupAccount");
		SetupAccount fdmEmployeeData = document.toObject(SetupAccount.class);
		createFDMEmployee(fdmEmployeeData.getName(), fdmEmployeeData.getUsername(), fdmEmployeeData.getEmail(), 
			fdmEmployeeData.getId(), stringToDate(fdmEmployeeData.getDob()), fdmEmployeeData.getHeight(), fdmEmployeeData.getWeight());
		normalResponse();
	}

	private void login(){
		
	}

	private void findEmail(){

	}

	private void addCalories(){

	}

	private void searchFood(){

	}

	private void getTotalCalories(){

	}

	private void editCalories(){

	}

	private void updateBMI(){

	}

	private void getBMI(){

	}

	private void getBMIHistory(){

	}

	private void logout(){

	}

	private void createFDMEmployee(String nname, String userName, String email, String iid, LocalDateTime ddate, int height, int weight) {
		FDMEmployee fdmEmployee = new FDMEmployee(nname, userName, email, iid, ddate, height, weight);
		this.currentFDMEmployee = fdmEmployee;
		updateCurrentEmployee();
	}

	private void updateCurrentEmployee() {
		this.fbdb.setItems("employees", this.currentFDMEmployee.getId(), this.currentFDMEmployee);
	}

	private String dateToString(LocalDateTime date) {
		return date.format(formatter);
	}

	private LocalDateTime stringToDate(String date) {
		return LocalDateTime.parse(date, formatter);
	}

	private void normalResponse() {
		this.fbdb.addToResponse("confirmation", true);
		this.fbdb.sendResponse();
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