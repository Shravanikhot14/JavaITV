package basics;

public class Example7 {

	public static void main(String[] args) {
		
		byte a=7;
		int b=8;        //widening typecasting (byte to int)
		
		int c=12344;
		byte d=(byte)c;     //narrowing typecasting (int to byte)
		
		int e=12354;
		byte f=(byte)e;       
		
		System.out.println(f);
		
		int m=(int)Math.PI;
	

	}

}
