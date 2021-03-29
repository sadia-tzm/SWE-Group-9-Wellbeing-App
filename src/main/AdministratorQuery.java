package main;

import java.time.LocalDateTime;

public class AdministratorQuery extends QueryRole {

	SystemAdministrator systemAdministrator;
	private String progress;

	public AdministratorQuery(String queryText, String queryTitle, LocalDateTime ddateLogged) {
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