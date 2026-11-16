package oops;

public class Doctor {
	
	int id;
	String name;
	String type;
	
	//non-parameterized constructor
	Doctor()
	{
		System.out.println("Doctor created");
	}
	
	//parameterized constructor
	Doctor(int id, String name,String type)
	{
		this.id=id;
		this.name=name;
		this.type=type;
	}

}
