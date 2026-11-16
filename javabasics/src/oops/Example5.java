package oops;

public class Example5 {

	public static void main(String[] args) {
		
		new Doctor();
		
		Doctor d1 = new Doctor(101, "Rohit", "Pediatrician");
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.type);
		
		
	}
}
