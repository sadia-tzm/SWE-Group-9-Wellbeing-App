package main;

import java.time.LocalDateTime;

public class Unavailability extends TimeSlot {

	MentalHealthAmbassador mentalHealthAmbassador;

	public  Unavailability(LocalDateTime dateAndTime, MentalHealthAmbassador mentalHealthAmbassador) {
		super(dateAndTime);
		this.mentalHealthAmbassador = mentalHealthAmbassador;
	}

}