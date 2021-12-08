

import java.util.Scanner;
class AgeExeption extends Exception{
	
	AgeExeption(String msg){
		
		super(msg);
	}

}
 class Voting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		if(age<18) {
			
			throw new AgeExeption("You are not eligible to vote");
		}	else {
		
		System.out.println("Eligible");
	}
			
	}
}
