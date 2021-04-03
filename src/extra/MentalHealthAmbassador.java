package main;
import java.util.*;

public class MentalHealthAmbassador extends User {

	ArrayList<Unavailability> unavailabilities;
	ArrayList<Appointment> appointments;
	ArrayList<Target> targets;

	public MentalHealthAmbassador(String name, String password, String userName, String email) {
		super(name, password, userName, email);
		unavailabilities = new ArrayList<Unavailability>();
		appointments = new ArrayList<Appointment>();
		targets = new ArrayList<Target>();
	}
	//Database related!
	// public List<TimeSlot> getBusyTimeSlots() {
	// 	// TODO - implement MentalHealthAmbassador.getBusyTimeSlots
	// 	throw new UnsupportedOperationException();
	// }

	public void setTarget(Exercise exercise, String attribute, int value, FDMEmployee fdmEmployee) {
		targets.add(new Target(exercise, attribute, value, fdmEmployee, this));
	}

	public void deleteTarget(Target target) {
		targets.remove(target);
	}
	
}