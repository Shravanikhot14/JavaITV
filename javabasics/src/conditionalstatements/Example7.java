package conditionalstatements;

import java.util.Scanner;

public class Example7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter experience in years:");
		int experience=sc.nextInt();
		
		System.out.println("Enter Salary");
		int salary=sc.nextInt();
		
		
		if(experience>10)
			System.out.println("Bonus: "+salary*0.2);
		else if(experience>=6 && experience<=10)
			System.out.println("Bonus: "+salary*0.15);
		else if(experience>=3 && experience<=5)
			System.out.println("Bonus: "+salary*0.1);
		else 
			System.out.println("Bonus: "+salary*0.05);
		
		
		
	}

}
