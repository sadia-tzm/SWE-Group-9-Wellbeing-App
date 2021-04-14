package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class HealthProperty {

	private long id;
	private LocalDateTime dateLogged;
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

	public HealthProperty(long id) {
		//initialise ID from healthHistory->variableHistory
		this.id = id;
		this.dateLogged = LocalDateTime.now();
	}

    public String getDateLogged() {
		return this.dateLogged.format(formatter);
	}

	public LocalDateTime findDate() {
		return this.dateLogged;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	//firebase stuff!!

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setDateLogged(String ddateLogged) {
		this.dateLogged = LocalDateTime.parse(ddateLogged, formatter);
	}

}