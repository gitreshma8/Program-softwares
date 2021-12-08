public class MaxArray{

public static void main(String[] args){

int[] a={4,2,5,6};


int max=0;
int min=0;
for (int i=0;i<a.length;i++){


if(max<a[i])

max=a[i];



}
System.out.println(max);

for (int i=0;i<a.length;i++){
if(min>a[i])

min=a[i];

}
System.out.println("min is"+min);
}
}