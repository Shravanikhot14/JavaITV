package arrays;

import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String flightName[]= {"Indigo", "SpiceJet", "Vistara"};
		int availableSeats[]= {12,10,3,2};
		
		
		for(int i=0; i<flightName.length; i++)
		{
			System.out.println("Flight name: "+flightName[i]);
			System.out.println("Available seats: "+availableSeats[i]);
			
			System.out.println("------------------------------------------");
		
		}
		
		System.out.println("How many tickets do you want to book??");
		int noOfSeats=sc.nextInt();
		

		for(int i=0; i<flightName.length; i++)
		{
			if(availableSeats[i]>=noOfSeats)
			{
				
				System.out.println("Flight name: "+flightName[i]);
				System.out.println("Available seats: "+availableSeats[i]);
				
				System.out.println("------------------------------------------");
			}
		}
	}
}

























