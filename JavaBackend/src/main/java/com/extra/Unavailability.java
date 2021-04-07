package com.extra;

import java.time.LocalDateTime;

import com.TimeSlot;

public class Unavailability extends TimeSlot {

	MentalHealthAmbassador mentalHealthAmbassador;

	public  Unavailability(LocalDateTime dateAndTime, MentalHealthAmbassador mentalHealthAmbassador) {
		super(dateAndTime);
		this.mentalHealthAmbassador = mentalHealthAmbassador;
	}

}