package main.extra;
import java.util.*;

import main.Exercise;
import main.FDMEmployee;
import main.User;

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

	//TODO - complete mentalhealthambassador

	//Database related!
	// public List<TimeSlot> getBusyTimeSlots() {
	// }

	public void setTarget(Exercise exercise, String attribute, int value, FDMEmployee fdmEmployee) {
		targets.add(new Target(exercise, attribute, value, fdmEmployee, this));
	}

	public void deleteTarget(Target target) {
		targets.remove(target);
	}
	
}