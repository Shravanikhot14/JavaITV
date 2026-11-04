package basics;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Enter two numbers:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("========================================");
		
		System.out.println(a++);    //post increment
		System.out.println(a);
		
		System.out.println(++a);    //pre increment
		
        System.out.println("========================================");
		
		System.out.println(b--);    //post decrement
		System.out.println(b);
		
		System.out.println(-b);    //pre decrement 
		
		
				

	}

}
