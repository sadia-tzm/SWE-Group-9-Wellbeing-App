package com;
import java.time.LocalDateTime;

public class TimeSlot {

	private LocalDateTime dateAndTime;
	private boolean busy;
	// private int timeSlotID;

	public TimeSlot(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
		busy = false;
	}

	public void setBusy(){
		this.busy = true;
	}

	public boolean getBusy(){
		return this.busy;
	}

	public LocalDateTime getDateAndTime(){
		return this.dateAndTime;
	}
}