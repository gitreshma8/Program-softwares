
import java.util.Scanner;

class DoWhile{
	
	static int option,Result;
	
	public static void main(String[] args){
	
			
		
		Scanner sc=new Scanner(System.in);
		
	
		
		do{
			
		
			System.out.println("Enter 1st number");
				
		int x=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int y=sc.nextInt();
		
		
					int sum=x+y;
					
					Result=sum;
					
			System.out.println("Do you want to perform the operation again/press 1 to continue and 0 to exit");
			int option=sc.nextInt();
			
			
		}while(option==1);
		
			// int Result=Sum;
		
	System.out.println("Result is" +" "+Result);
		
		
	}	
	
	
	
}