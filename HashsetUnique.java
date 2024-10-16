package Revature;

import java.util.HashSet;

public class HashsetUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> userNames=new HashSet<>();
		
		//adding usernames..
		userNames.add("Jyothi");
		userNames.add("Jyothsna");
		userNames.add("Sony");
		userNames.add("Somya");
		
		
		
		System.out.println(userNames);
		
		// .contains() method to check existing user 
		if(userNames.contains("Jyothi")) {
			System.out.println("user Existed");
		}else {
			System.out.println("Not Existed");
		}
		
		// .remove() to remove user
		userNames.remove("Sony");
		System.out.println("After Removing user :"+userNames);

	}

}
