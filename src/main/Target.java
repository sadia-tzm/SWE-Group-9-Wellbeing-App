package src.main;

import main.FDMEmployee;
import main.MentalHealthAmbassador;

public class Target {

	MentalHealthAmbassador mentalHealthAmbassador;
	FDMEmployee fdmEmployee;
	private Exercise exercise;
	private String attribute;
	private int value;
	private boolean isMet;


	
	
	/**
	 * 
	 * @param eexercise
	 * @param aattribute
	 * @param vvalue
	 * @param ffdmEmployee
	 * @param mmentalHealthAmbassador
	 */

	public boolean Target(Exercise eexercise, String aattribute, int vvalue, FDMEmployee ffdmEmployee, MentalHealthAmbassador mmentalHealthAmbassador){
		this.mentalHealthAmbassador = mmentalHealthAmbassador;
		this.fdmEmployee = ffdmEmployee;
		this.exercise = eexercise;
		this.attribute = aattribute;
		this.value = vvalue;
		
		
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

	/**
	 * 
	 * @param newValue
	 */
	public boolean setValue(int newValue) {
		// TODO - implement Target.setValue
		throw new UnsupportedOperationException();
	}

	public void targetMet() {
		// TODO - implement Target.targetMet
		throw new UnsupportedOperationException();
	}

}