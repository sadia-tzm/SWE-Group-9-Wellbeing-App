package main;
public class AdminstratorQuery extends QueryRole {

	SystemAdministrator systemAdministrator;
	private Query query;
	private String progress;

	/**
	 * 
	 * @param SystemAdministrator
	 */
	public boolean startProgress(SystemAdministrator ssystemAdministrator) {
		this.systemAdministrator = ssystemAdministrator;
		this.progress = "Starting to Resolve Query";
		return true;
	}

	/**
	 * 
	 * @param sstatus
	 */
	public boolean updateProgress(String sstatus) {
		this.progress = sstatus;
		return true;
	}

	public String getProgress() {
		return this.progress;
	}

	/**
	 * 
	 * @param qquery
	 * @return 
	 */
	public void AdministratorQuery(Query qquery) {
		this.query = qquery;
	}

}