package arrays;

public class Example5 {
	
	public static void main(String[] args) {
		
		int prices[]= {3300,4500,2500,5000,2000};
		
		int sum=0;
		
		for(int price:prices)
		{
			sum=sum+price;
		}
		
		System.out.println("Average of prices is: "+(sum/prices.length));
	}

}
