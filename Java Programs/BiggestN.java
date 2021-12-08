class BiggestN{
public static void main(String args[]){

int arr[]={4,5,6,7};

int x=arr[0];

for(int i=0;i<arr.length;i++){

System.out.print(arr[i]+" ");

if (arr[i]>x){

x=arr[i];

}

}

System.out.println();
System.out.println(x);

}
}