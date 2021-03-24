package main;

public class Weight extends HealthProperty {

	private int weight;

	public Weight(int wweight) {
		super();
		weight = wweight;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

}