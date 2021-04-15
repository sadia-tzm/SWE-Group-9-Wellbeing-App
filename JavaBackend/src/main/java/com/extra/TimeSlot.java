//framework for unused class QueryRole:


//--------------------------------------------------------

package com.extra;
import java.time.LocalDateTime;

public class TimeSlot {

	private LocalDateTime dateAndTime;
	private boolean busy;

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