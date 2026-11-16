package arrays;

public class Example10 {
	
	public static void main(String[] args) {
		
		String names[]= {"Nisha", "Anisha", "Manisha"};
		
		for(String name: names)
		{
			if(name.startsWith("A"))
				System.out.println(name);
		}
		
	}

}
