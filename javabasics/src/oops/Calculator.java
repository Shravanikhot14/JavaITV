package oops;

public class Calculator {
	
	int add(int a,int b)
	{
		return a+b;
	}

	int square(int s)
	{
		return s*s;
	}
	
	double areaOfCircle(double r)
	{
		return Math.PI*r*r;
	}
	
	boolean isEven(int n)
	{
		return n%2==0;
	}
}
