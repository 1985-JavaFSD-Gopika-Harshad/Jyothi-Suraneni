package Revature;

import java.util.LinkedHashMap;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> grades=new LinkedHashMap<>();
		//adding details..
		
		grades.put("Abhi", 99);
		grades.put("Ram", 98);
		grades.put("Uma", 97);
		grades.put("Vikas",35);
		grades.put("Ansh", 96);
		grades.put("Avi", 98);
		
		System.out.println(grades);
		
		for(String id:grades.keySet()) {
			System.out.println("Grade for "+id+" is : "+grades.get(id));
		}
		
		
	}

}
