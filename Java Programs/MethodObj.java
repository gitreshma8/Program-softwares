class MethodObj{

String color;
int age;

void intObj(String c,int a){

color=c;//local variable
age=a;//local variable

}

void display(){

System.out.println(color+" "+age);

}


public static void main(String args[]){

MethodObj rott=new MethodObj();
rott.intObj("black",10);
rott.display();

}



}






