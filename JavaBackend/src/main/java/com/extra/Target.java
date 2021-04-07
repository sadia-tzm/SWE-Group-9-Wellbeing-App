package com.extra;

import com.Exercise;
import com.FDMEmployee;

public class Target {

	MentalHealthAmbassador mentalHealthAmbassador;
	FDMEmployee fdmEmployee;
	private Exercise exercise;
	private String attribute;
	private int value;
	private boolean isMet;


	public Target(Exercise exercise, String attribute, int value, FDMEmployee fdmEmployee, MentalHealthAmbassador mentalHealthAmbassador){
		this.mentalHealthAmbassador = mentalHealthAmbassador;
		this.fdmEmployee = fdmEmployee;
		this.exercise = exercise;
		this.attribute = attribute;
		this.value = value;
		isMet = false;
		
		
	}

	public Exercise getExercise() {
		return this.exercise;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public int getValue() {
		return this.value;
	}

	public boolean setValue(int newValue) {
		this.value = newValue;
		return true;
	}

	public void targetMet() {
		this.isMet = true;
	}

}