package loops;

import java.util.Scanner;

public class Example19 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1;
		int n2;
		char choice;
		
		do
		{
			System.out.println("Enter first number:");
			n1=sc.nextInt();
			System.out.println("Enter second number:");
			n2=sc.nextInt();
			
			System.out.println("Addition is "+(n1+n2));
			
			System.out.println("Do you want to continue (y/n)");
			choice=sc.next().charAt(0);
			
		}while(choice=='y');
	}

}
