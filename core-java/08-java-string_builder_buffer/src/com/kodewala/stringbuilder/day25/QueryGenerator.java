package com.kodewala.stringbuilder.day25;
/**
 * This class is responsible for query generation
 */
public class QueryGenerator {
	
	public StringBuilder generateQuery(int salary, String empID) {
		StringBuilder query = new StringBuilder("select * from employee ");
		
		if(salary > 0) {
			query.append("where salary = " + salary + ";"); // modifying existing object
		} else if(empID != null) {
			query.append(" where empID = " + empID + ";"); // modifying existing object
		} else {
			query.append(";"); // modifying existing object
		}
		
		return query;
	}
}
