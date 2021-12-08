public class Swap1{
	

	public static void main(String[] args) {
		
		int a=10;  
		int b=5; 
		
		System.out.println("Before swap");
		System.out.println("value of a" +a);
		System.out.println("value of b" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap");
		System.out.println("value of a" +a);
		System.out.println("value of b" +b);
		
	}

}
