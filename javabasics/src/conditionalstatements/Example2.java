package conditionalstatements;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int balance=1000;
		
		System.out.println("Enter amount to withdraw: ");
		int amount=sc.nextInt();
		
		if(amount>balance)
			System.out.println("Insufficient balance");
		else
			balance-=amount;
		
		System.out.println("Balance is "+balance);
		
	}

}
