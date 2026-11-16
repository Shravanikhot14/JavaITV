package arrays;

public class Example4 {
	
	public static void main(String[] args) {
		
		int prices[]= {3300,4500,2500,5000,2000};
		
		int max=prices[0];
		int min=prices[0];
		
		for(int price:prices)
		{
			if(price>max)
				max=price;
			else if(price<min)
				min=price;
		}
		System.out.println("The most expensive flight is: "+max);
		System.out.println("The cheapest flight is "+min);
	}

}
