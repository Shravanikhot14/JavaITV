package arrays;

public class Example7 {
	
	public static void main(String[] args) {	
		
		int marks[][]= {{11,12,14},{15,16,19},{1,20,17}};
		
		System.out.println(marks[2][1]);
		
		System.out.println("====================================");
		
		for(int n[]:marks)
		{
			for(int m:n)
			{
				System.out.println(m);
			}
		}
			
		System.out.println("===============================");
		
		for(int i=0; i<marks.length;i++)
		{
			for(int j=0; j<marks.length; j++)
			{
				System.out.println(i+" "+j+" = "+marks[i][j]);
			}
		}

     }
}


