//framework for unused class Appointment:


//--------------------------------------------------------


package com.extra;
import java.time.LocalDateTime;

import com.FDMEmployee;

public class Appointment extends TimeSlot {

	MentalHealthAmbassador mentalHealthAmbassador;
	FDMEmployee fdmEmployee;

	public Appointment(LocalDateTime ddateAndTime, MentalHealthAmbassador mmentalHealthAmbassador, FDMEmployee ffdmEmployee) {
		super(ddateAndTime);
		this.mentalHealthAmbassador = mmentalHealthAmbassador;
		this.fdmEmployee = ffdmEmployee;
	}
}