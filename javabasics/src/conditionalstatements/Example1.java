package conditionalstatements;

public class Example1 {
	
	public static void main(String[] args) {
		
		boolean subscribed=true;
		
		double total=1000;
		
		if(subscribed)
			total=total*0.9;
		
		System.out.println("Total amount to be paid is: "+ total);
			
		
	}

}
