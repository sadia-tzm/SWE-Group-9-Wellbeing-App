//framework for unused class QueryRole:


//--------------------------------------------------------

package com.extra;
public class SupportQuery extends QueryRole {

	CustomerSupport customerSupport;


	public SupportQuery(Query qquery, CustomerSupport customerSupport) {
		super(qquery);
		this.customerSupport = customerSupport;
	}

}