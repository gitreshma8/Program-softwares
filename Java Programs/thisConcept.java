class thisConcept{
	
	int i;
	
	void readValue(int i){
		
		this.i=i;
	}
	void show(){
		
		System.out.println(this.i);
		
		
	}
	
	public static void main(String[] args){
		
		
		thisConcept tc=new thisConcept();
		tc.readValue(10);
		tc.show();
		
	}
	
}
	
	