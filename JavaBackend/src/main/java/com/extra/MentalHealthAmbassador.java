//framework for unused class MentalHealthAmbassador:


//--------------------------------------------------------


package com.extra;
import java.util.*;

import com.FDMEmployee;
import com.User;

public class MentalHealthAmbassador extends User {

	ArrayList<Unavailability> unavailabilities;
	ArrayList<Appointment> appointments;
	ArrayList<Target> targets;

	public MentalHealthAmbassador(String name, String userName, String email) {
		super(name, userName, email);
		unavailabilities = new ArrayList<Unavailability>();
		appointments = new ArrayList<Appointment>();
		targets = new ArrayList<Target>();
	}

	public void setTarget(Exercise exercise, String attribute, int value, FDMEmployee fdmEmployee) {
		targets.add(new Target(exercise, attribute, value, fdmEmployee, this));
	}

	public void deleteTarget(Target target) {
		targets.remove(target);
	}
	
}