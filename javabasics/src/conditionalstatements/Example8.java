package conditionalstatements;

public class Example8 {
	
	public static void main(String[] args) {
		
		int a=8, b=7, c=9;
		
		if(a>b && a>c)
			System.out.println("a is the greatest");
		else if(b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
	}

}
