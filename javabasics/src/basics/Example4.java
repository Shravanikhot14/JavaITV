package basics;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		int n=sc.nextInt();
//		System.out.println(n*n);
		
		System.out.println("Enter length:");
		int l=sc.nextInt();
		
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		
		System.out.println("Area of rectangle is "+(l*b));

	}

}
