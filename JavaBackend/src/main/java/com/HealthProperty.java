package com;

import java.time.LocalDateTime;

public abstract class HealthProperty {

	private long ID;

	private LocalDateTime dateLogged;

	public HealthProperty() {
		//initialise ID from healthHistory->variableHistory
		this.dateLogged = LocalDateTime.now();
	}

    public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}
	public void setDateLogged(LocalDateTime dateLogged) {
		this.dateLogged = dateLogged;
	}

}