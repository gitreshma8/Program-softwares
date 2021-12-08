
public class MethodsAddMul {

	 static int a=12,b=10;

	
	static int Addition() {
		
			
		int sum=a+b;
			
		System.out.println("Result is"+" " +sum);

		return sum;
	
		
	}
	
	
static int Multiplicaton() {
		
		
		int product=a*b;
		int result=product+b;
		System.out.println("Multiplication Result is"+ " " +result);
		
		return product;
	}

	
	
	public static void main(String[] args) {
	
MethodsAddMul.Addition();

MethodsAddMul.Multiplicaton();

		
	}

}
