package oops;

public class Passenger {
	
	String name;
	String email;
	int age;

	void printPassengerDetails()
	{
		System.out.println(name+" "+email+" "+age);
	}
	
	Passenger(String name, String email, int age)
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}
}
