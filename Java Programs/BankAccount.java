import java.util.Scanner;
public class BankAccount {

		static double depo,wa,ab=500;
	

		static void deposit(){
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Deposit Amount");
			 depo=sc.nextDouble();
			
		double TA=depo+ab;
			 System.out.println("Total Balance is:"+TA);

		}

		static void withDrawal(){

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Withdrawal Amount");
			 wa=sc.nextDouble();
			 double TotalBal=ab-wa;
						
		if (wa>ab){

		System.out.println("Insufficient Balance");

		}
		
		else{
//			double TotalBal=TA-wa;
		System.out.println("Account balance is :" +TotalBal);
		}

		
		}

		static void accountBalance(){

			double TotalBal=depo+ab;
			System.out.println(TotalBal);
				}
		
	public static void main(String[] args) {
		BankAccount.deposit();		
		BankAccount.accountBalance();	
		BankAccount.withDrawal();
		
	}

}
