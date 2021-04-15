//framework for unused class Query:


//--------------------------------------------------------


package com.extra;

import java.time.LocalDateTime;

import com.User;

public class Query {

	User user;
	QueryRole queryRole;
	private String queryID;
	private String queryTitle;
	private String queryText;
	private LocalDateTime dateLogged;

	public Query(String qqueryText, String qqueryTitle, LocalDateTime ddateLogged) {
		// this.queryID = ;
		this.queryTitle = qqueryTitle;
		this.queryText = qqueryText;
		this.dateLogged = ddateLogged; 
		
	}

	public void changeRole(String role) {
		if(role.equals("SupportQuery")){
			this.queryRole = new SupportQuery(this, (CustomerSupport) this.user) ;
		} else if (role.equals("AdminstratorQuery")){
			this.queryRole = new AdministratorQuery(this, role, role, dateLogged);
		} else {
			// error ? 
		}
	}

	public String getID() {
		return this.queryID;
	}

	public String getTitle() {
		return this.queryTitle;
	}

	public String getText() {
		return this.queryText;
	}

	public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

}