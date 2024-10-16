package Revature;

import java.util.HashMap;

public class Student {
	public static void main(String[] args) {
		HashMap<String,Integer> grades=new HashMap<>();
		grades.put("Jyothi",95);
		grades.put("Jyothsna",85);
		grades.put("Sony",75);
		grades.put("Somya", 88);
		
		
		System.out.println("all students with grades :"+ grades);

		
		System.out.println("grade of student  : Prasad01 ="+grades.get("Jyothi"));
		
		grades.put("Jyothi",75);
		
		grades.remove("Somya");
		
		System.out.println("all students with grades :"+ grades);

	}
}