class ThreeDimArray{

public static void main(String[]args){

//3d array...so 3 braces,single line declaration,creaton & initiaization
int[][][] a={{{10,20,3,4},{5,6,7},{8,9,10}}};

for(int i=0;i<a.length;i++){

for(int j=0;j<a[i].length;j++){

for(int k=0;k<a[i][j].length;k++){

System.out.print(a[i][j][k]+" ");


}

System.out.println();

}
}


}

}