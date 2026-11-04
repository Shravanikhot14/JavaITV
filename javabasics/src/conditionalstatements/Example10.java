package conditionalstatements;

import java.util.Scanner;

public class Example10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a vowel");
			break;
			
		default:
			System.out.println("It is a consonant");
			
		}
	}

}
