
import java.util.Scanner;
		
class BankOpns{


int Balance=500;



public static void transaction(){

int choice,Balance,Dep;
Scanner sc=new Scanner(System.in);
System.out.println("Please select an option");
System.out.println("1:Withdraw");
System.out.println(" 2:Deposit");
System.out.println("Account Balance");

choice=sc.nextInt();

switch(choice){



case 1:

float WD;

System.out.println("Enter the amount to withdraw");

WD=sc.nextfloat();

if(WD>balance||WD==0){

System.out.println("Insufficient Balance");

}
else{

Balance=Balance-WD;

System.out.println("You have withdrawn" +WD +"the balance is" +Balance);

}

break;

case 2:


System.out.println("Enter the Deposit amount");

Dep=sc.nextInt();
if(Dep<1){
System.out.println("Enter the correct Deposit amount");
}
Balance=Balance+Dep;

System.out.println("Deposited amount is :"+Dep +"account balance is:"+Balance);

break;



/*case3:



brreak;*/


}


}




public static void main (String[] args){


BankOpns.transaction();






}





}
