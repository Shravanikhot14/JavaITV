package arrays;

public class Example1 {
	
	public static void main(String[] args) {
		
		//data_type array_name[]={v1,v2,v3,.............vn};
		//array_Name.length can help you find the size of an array.
		
		//data_type array_name[]=new array_name[size];
		
		String flightName[]= {"Indigo", "SpiceJet", "Vistara"};
		
		System.out.println(flightName.length);
		
		System.out.println(flightName[0]);
		System.out.println(flightName[1]);
		System.out.println(flightName[2]);
		
		System.out.println("===============for loop======================");
		
		for(int i=0; i<flightName.length; i++)
		{
			System.out.println(i+" "+flightName[i]);
		}
		
		System.out.println("==================enhance for loop===================");
		
		for(String name: flightName)
		{
			System.out.println(name);
		}
		
	}

}
