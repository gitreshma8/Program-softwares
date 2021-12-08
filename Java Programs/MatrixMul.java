
class Practice{
	
	
	public static void main(String[] args) {
		
		int[][] a={ {2,3},{4,2},{5,6}};  			//Ac=Br---a[3][2]
		int[][] b= {{3,2,5},{4,6,2},{1,2,3}};    //          b[3][3]
		
		
		int [][] c=new int[3][3];        //c==>Ar=Bc
		
		for(int i=0;i<3;i++) {           //c row count
			
			for(int j=0;j<3;j++) {       //c column count
				
				c[i][j]=0;
				
				for(int k=0;k<2;k++) {			//k count is chnage count=2
					
					c[i][j]+=a[i][k]*b[k][j];   //k==>change element=k
				}
					
					System.out.print(c[i][j]+" ");
			
			}
			System.out.println();
		}
			
	}
}
/*
2 3			3 2 5
4 2			4 6 2
5 6			1 2 3


6+8+2

*/
