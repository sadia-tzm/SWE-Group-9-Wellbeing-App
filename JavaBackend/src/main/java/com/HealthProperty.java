package com;

import java.time.LocalDateTime;

public abstract class HealthProperty {

	long ID;

	LocalDateTime dateLogged;

	public HealthProperty() {
		//initialise ID from healthHistory->variableHistory
		this.dateLogged = LocalDateTime.now();
	}

    public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

}