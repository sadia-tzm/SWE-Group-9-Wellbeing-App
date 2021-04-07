package main.extra;
import java.time.LocalDateTime;

import main.FDMEmployee;
import main.TimeSlot;

public class Appointment extends TimeSlot {

	MentalHealthAmbassador mentalHealthAmbassador;
	FDMEmployee fdmEmployee;

	public Appointment(LocalDateTime ddateAndTime, MentalHealthAmbassador mmentalHealthAmbassador, FDMEmployee ffdmEmployee) {
		super(ddateAndTime);
		this.mentalHealthAmbassador = mmentalHealthAmbassador;
		this.fdmEmployee = ffdmEmployee;
	}

	//TODO - rest of Appointment

}