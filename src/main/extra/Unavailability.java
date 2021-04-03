package main.extra;

import java.time.LocalDateTime;

import main.TimeSlot;

public class Unavailability extends TimeSlot {

	MentalHealthAmbassador mentalHealthAmbassador;

	public  Unavailability(LocalDateTime dateAndTime, MentalHealthAmbassador mentalHealthAmbassador) {
		super(dateAndTime);
		this.mentalHealthAmbassador = mentalHealthAmbassador;
	}

}