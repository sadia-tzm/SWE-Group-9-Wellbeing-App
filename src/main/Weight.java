package main;

import java.time.LocalDateTime;

public class Weight extends HealthProperty {

	private int weight;

	public Weight(LocalDateTime ddateLogged, int wweight) {
		super(ddateLogged);
		weight = wweight;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

}