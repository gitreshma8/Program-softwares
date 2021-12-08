class BubbleSort{
	
	public static void main(String[] args){
		
		
		int[] a={22,12,43,34,25};
		
		int temp;
		for(int i=0;i<a.length;i++){
			
	
			
			for(int j=0;j<a.length-1;j++)
			{
				//comparing elements
				if(a[j]>a[j+1]){
					
					temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;
			
				}
			}
		
		
	}
	//printing elements
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		
		
	}
}
}