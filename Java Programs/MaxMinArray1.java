public class MaxMinArray1{


public static void main(String[] args){

int []a={3,2,6,4};

int max=a[0];

int min=a[0];

for(int i=1;i<a.length;i++){


if(max<a[i]){

max=a[i];

}else if(min>a[i]){

min=a[i];

}


}
System.out.println("max is"+max);

System.out.println("min is"+min);

}



}