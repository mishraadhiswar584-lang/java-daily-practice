package com.kodewala.stringbuilder.day25;

public class QueryDriver {

	public static void main(String[] args) {
		QueryGenerator generator = new QueryGenerator();
		StringBuilder resultBuilder1 = generator.generateQuery(12000, null);
		StringBuilder resulBuilder2 = generator.generateQuery(0, "EMP4512");

		System.out.println(resultBuilder1); // O/P : resulBuilder2
		System.out.println(resulBuilder2);
	}
}
