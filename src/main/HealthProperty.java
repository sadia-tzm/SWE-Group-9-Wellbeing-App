package main;

import java.time.LocalDateTime;

public abstract class HealthProperty {

	LocalDateTime dateLogged;

	public HealthProperty(LocalDateTime ddateLogged) {
		this.dateLogged = ddateLogged;
	}

	public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

}