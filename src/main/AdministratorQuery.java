package main;
public class AdministratorQuery extends QueryRole {

	SystemAdministrator systemAdministrator;
	private Query query;
	private String progress;

	public void AdministratorQuery(Query qquery) {
		this.query = qquery;
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