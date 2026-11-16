package arrays;

import java.util.Scanner;

public class Example3 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//data_type array_name[]=new array_name[size];
		
		String passengers[]=new String[4];
		
		for(int i=0; i<passengers.length; i++)
		{
			passengers[i]=sc.next();
		}
		
		System.out.println("==============================");
		
		for(String p: passengers)
		{
			System.out.println(p);
		}
	}

}
