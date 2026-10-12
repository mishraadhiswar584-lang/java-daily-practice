package com.kodewala.stringbuilder.day25;
/**
 * Understanding StringBuilder
 */
public class Driver1 {
	public static void main(String[] args) {
//		StringBuilder is mutable
		StringBuilder sb = new StringBuilder("Sushovan"); // literal goes in SCP
		sb.append(" Jana"); // literal goes in SCP
		/**
		 * Because of new keyword "Sushovan" was created inside HEAP also
		 * sb is pointing to HEAP object (Sushovan)
		 * sb.append() : it modifying the same object in HEAP
		 * total object created : 3
		 * 	in SCP 2 objects. 
		 * 	and in HEAP one object.
		 * 	modification happened in existing HEAP object.
		 */
		System.out.println(sb); // O/P : Sushovan Jana
	}
}
