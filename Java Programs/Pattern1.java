
import java.util.Scanner;

class Pattern1{
	
	static void Marks(){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your marks");
		
		int mk=sc.nextInt();
			
	if(mk<40){
		
		System.out.println("Failed");
		
	}
	else if (mk>=40|| mk<=60){
			System.out.println("Grade D");
		
	}
	
	else if(mk>=70||mk<=80){
		
			System.out.println("Grade B");
		
	}
	
	else if(mk>=81||mk<=100){
		
			System.out.println("Grade A");
		
	}
	
	else{
		
		System.out.println("Quit");
	}
	
	
	}
	
	
	public static void main(String[] args){
		
		
		Pattern1.Marks();
		
		

	}
	
	
}