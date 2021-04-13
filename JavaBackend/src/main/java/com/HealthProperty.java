package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class HealthProperty {

	private long ID;

	private LocalDateTime dateLogged;
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

	public HealthProperty() {
		//initialise ID from healthHistory->variableHistory
		this.dateLogged = LocalDateTime.now();
	}

    public String getDateLogged() {
		return this.dateLogged.format(formatter);
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}
	public void setDateLogged(String ddateLogged) {
		this.dateLogged = LocalDateTime.parse(ddateLogged, formatter);
	}

}