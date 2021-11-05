package CoreJava;


class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("barking...");}  
}  


public class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal d=new Dog(); 
		d.eat();
	}

}
