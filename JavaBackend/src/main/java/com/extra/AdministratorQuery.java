//framework for unused class AdministratorQuery:


//--------------------------------------------------------


package com.extra;

import java.time.LocalDateTime;

public class AdministratorQuery extends QueryRole {

	SystemAdministrator systemAdministrator;
	private String progress;

	public AdministratorQuery(Query query, String queryText, String queryTitle, LocalDateTime ddateLogged) {
		super(query);
		query = new Query(queryText,queryTitle,ddateLogged);
	}

	public boolean startProgress(SystemAdministrator ssystemAdministrator) {
		this.systemAdministrator = ssystemAdministrator;
		this.progress = "Starting to Resolve Query";
		return true;
	}

	public boolean updateProgress(String sstatus) {
		this.progress = sstatus;
		return true;
	}

	public String getProgress() {
		return this.progress;
	}

}