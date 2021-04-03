package main;
import java.time.LocalDateTime;

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