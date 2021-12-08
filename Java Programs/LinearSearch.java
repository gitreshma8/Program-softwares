

import java.util.Scanner;
class LinearSearch{


public static void main(String[] args){

int[]arr={3,2,5,4,6,1};

Scanner sc=new Scanner(System.in);

System.out.println("Enter the search element");

int item=sc.nextInt();


for(int i=0;i<arr.length;i++){
	
	
	if(arr[i]==item){
		
		System.out.println("Searched item is in index position" +" "+i);
		
	}
	
	
}
}
}