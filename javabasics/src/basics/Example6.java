package basics;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		
		System.out.println("Area of circle is "+(Math.PI*radius*radius));

	}

}
