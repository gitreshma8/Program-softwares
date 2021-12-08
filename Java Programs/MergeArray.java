


public class MergeArray {
	
	public static void main(String[] args) {
		
		int[] a={1,2,3,4};
		int[] b= {5,6,7};
		int[] c= {8,9};
		int[] d= {10};
		
		int a1=a.length;
		int b1=b.length;
		int c1=c.length;
		int d1=d.length;
		
		int e1=a1+b1+c1+d1;
		
		int[] result=new int[e1];
		
		for(int i=0;i<a1;i++) {
			
			result[i]=a[i];
		}
		
		for(int i=0;i<b1;i++) {
			
			result[a1+i]=b[i];
		}
		for(int i=0;i<c1;i++) {
			
			result[a1+b1+i]=c[i];
		}
		
		for(int i=0;i<d1;i++) {
			
			result[a1+b1+c1+i]=d[i];
		}
		
		
	for(int i=0;i<e1;i++) {
		
		System.out.print(result[i]+" ");
	}
		
	}
	
}