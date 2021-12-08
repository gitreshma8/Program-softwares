

import java.util.Scanner;

class LargeSmall{
	
	static int max=0,min=0,choice;
	
	public static void main(String[] args){
		
				Scanner sc=new Scanner(System.in);		
		
		do{	
		
		
			System.out.println("Enter the number");
			
			int number=sc.nextInt();
		
				
			if(max<number){
			
				
				max=number;
				
			}
			
			if(min>number){
				
				min=number;
			
				
			}
			
			
		 System.out.print("Do you want to continue,press 1 ");
            int choice = sc.nextInt();
		}
		
		
		while(choice==1);
			
			
		  System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
		
				
	}
	
	
}

