package main;

import java.time.LocalDateTime;

public abstract class HealthProperty {

	LocalDateTime dateLogged;

	public HealthProperty() {
		this.dateLogged = LocalDateTime.now();
	}

    public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

}