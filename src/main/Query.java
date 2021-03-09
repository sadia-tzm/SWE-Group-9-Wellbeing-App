package main;
public class Query {

	User user;
	QueryRole queryRole;
	private String queryID;
	private String queryTitle;
	private String queryText;
	private LocalDateTime dateLogged;

	/**
	 * 
	 * @param qqueryText
	 * @param qqueryTitle
	 * @param ddateLogged
	 * @param qqueryRole
	 */
	public void Query(String qqueryText, String qqueryTitle, LocalDateTime ddateLogged, QueryRole qqueryRole) {
		// TODO - implement Query.Query
		throw new UnsupportedOperationException();
	}

	public void changeRole() {
		// TODO - implement Query.changeRole
		throw new UnsupportedOperationException();
	}

	public String getID() {
		// TODO - implement Query.getID
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		// TODO - implement Query.getTitle
		throw new UnsupportedOperationException();
	}

	public String getText() {
		// TODO - implement Query.getText
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getDateLogged() {
		return this.dateLogged;
	}

}