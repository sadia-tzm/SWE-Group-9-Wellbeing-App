package main;
public class SupportQuery extends QueryRole {

	CustomerSupport customerSupport;
	private Query query;

	/**
	 * 
	 * @param qquery
	 */
	public void SupportQuery(Query qquery) {
		this.query = qquery;
	}

	/**
	 * 
	 * @param title
	 * @param message
	 */
	public boolean sendUserMessage(String title, String message) {
		// TODO - implement SupportQuery.sendUserMessage
		throw new UnsupportedOperationException();
	}

	public void forwardToAdministrator() {
		// TODO - implement SupportQuery.forwardToAdministrator
		throw new UnsupportedOperationException();
	}

}