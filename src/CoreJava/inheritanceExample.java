package CoreJava;

public class inheritanceExample {

	public static void main(String[] args) {
		
		birds b = new birds();
		fish f = new fish();
		System.out.println("Birds have "+b.numberofeyes+" eyes");
		System.out.println("Birds have "+b.numberoflegs+" legs");
		
		System.out.println("Fish have "+f.numberofeyes+" eyes");
		System.out.println("Fish have "+f.numberoflegs+" legs");

	}

}

 class animals {
	
	int numberofeyes = 2;
}
 
class birds extends animals {
	
	int numberoflegs =2;
}
class fish extends animals {
	
	int numberoflegs =0;
}