package loops;

public class Example6 {
	
	public static void main(String[] args) {
		
		int n=153;
		int num=n;     //store for backup
		
		int noOfDigits= String.valueOf(n).length();
		
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(int)Math.pow(rem, noOfDigits);
			n=n/10;
		}
		
		if(sum==num)
			System.out.println(num+ " is an armstrong number");
		else
			System.out.println(num+ " is not an armstrong number");
	}

}
