package loops;

import java.util.Scanner;

public class Example8 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of table to be printed: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
