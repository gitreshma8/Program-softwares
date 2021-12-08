class Animal{
public void eat(){

System.out.println("I am eating");

}



public static void main(String []args){

System.out.println("1");

Animal rott=new Animal();
rott.eat();

//rott.run();//

Animal husky=new Animal();
husky.run();

}

public void run(){

System.out.println("i am running");

}

}