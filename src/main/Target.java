package src.main;
public class Target {

	MentalHealthAmbassador mentalHealthAmbassador;
	FDMEmployee fdmEmployee;
	private Exercise exercise;
	private String attribute;
	private int value;
	private boolean isMet;

	public static void main(String[] args){
		System.out.println("Hello");
	} 
	
	
	/**
	 * 
	 * @param eexercise
	 * @param aattribute
	 * @param vvalue
	 * @param ffdmEmployee
	 * @param mmentalHealthAmbassador
	 */
	public boolean Target(Exercise eexercise, String aattribute, int vvalue, FDMEmployee ffdmEmployee, MentalHealthAmbassador mmentalHealthAmbassador) {
		// TODO - implement Target.Target
		throw new UnsupportedOperationException();
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