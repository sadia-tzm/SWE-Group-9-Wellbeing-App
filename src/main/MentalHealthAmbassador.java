package main;
import java.util.*;

public class MentalHealthAmbassador extends User {

	Collection<Unavailability> unavailabilities;
	Collection<Appointment> appointments;
	Collection<Target> targets;

	private String password;
	private String userName;
	private String email;


	/**
	 * 
	 * @param nname
	 * @param password
	 * @param userName
	 * @param email
	 */
	public MentalHealthAmbassador(String nname, String ppassword, String uuserName, String eemail) {
		super.name = nname;
		this.password = ppassword;
		this.userName = uuserName;
		this.email = eemail; 

		
	}

	public List<TimeSlot> getBusyTimeSlots() {
		// TODO - implement MentalHealthAmbassador.getBusyTimeSlots
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param property
	 * @param type
	 * @param value
	 * @param fdmEmployee
	 */
	public boolean setTarget(String property, String type, int value, FDMEmployee fdmEmployee) {
		// TODO - implement MentalHealthAmbassador.setTarget
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ttarget
	 */
	public boolean deleteTarget(Target ttarget) {
		// TODO - implement MentalHealthAmbassador.deleteTarget
		throw new UnsupportedOperationException();
	}

}