
public class LogicalOp{
	

	public static void main(String[] args) {
		
		int a=6;
		int b=4;
		int c=10;
	
	
		System.out.println(!(a>b&&a<b));
		System.out.println(!(a>c||b<c&&a>b));
		System.out.println(!(a>c&&b>a||c>a++));
		

	}

}
