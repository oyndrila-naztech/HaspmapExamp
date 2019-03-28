package com.java.hashmap;

import java.util.HashMap;

public class Datainsert {
	public static void datainsert() {
		Empname emp=new Empname();
		emp.setVmName("OOO");
		emp.setMemory(202);
		emp.setPlatform("Windows");
		HashMap<String, Empname> mapper = new HashMap<String, Empname>();
		mapper.put("somekey", emp);
		
		System.out.println(mapper);
		
		
		
	}

}
