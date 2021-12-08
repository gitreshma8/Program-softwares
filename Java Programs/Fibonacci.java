

import java.util.Scanner;
class Fibonacci{
	
	public static void main(String[] args){
		
		int a=0,b=1;
		System.out.println(a+" "+b);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
			
			n=a+b;
			a=b;
			b=n;			
			
			System.out.print(n+" ");
		}
		
	}
}