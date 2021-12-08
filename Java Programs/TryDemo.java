

public class TryDemo {

	public static void main(String[] args) {
	
	try{
	int a=10,b=0,c;
	c=a/b;
	}catch(Exception e){
		
		System.out.println(e);
		
	System.out.println("cannot divide by zero " );	
			
	}
	
	System.out.println("not an abnormal termination" );	
	
	
	}

}
