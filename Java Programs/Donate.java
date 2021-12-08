
import java.util.Scanner;

class Donate{


public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter your age");
	int x=sc.nextInt();
	
	
	System.out.println("Enter your weight");
	int y=sc.nextInt();
	
	
	
	if(x>18){
		
		
		
		if(y>50){
			
			System.out.println("You are eligible");			
			
		}
		

		else{
		
		System.out.println("not eligible");
	}
		
	}
	
	else{
		
		System.out.println("Please enter age greater than 18");
	}
	
	
}

}