package com;

public class Weight extends HealthProperty {

	private int weight;
  
	public Weight(long id, int weight) {
		super(id);
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!
	public Weight() {
		super(0);
	}
}