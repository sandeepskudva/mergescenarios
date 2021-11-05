package String_Number_Programs;


public class identifyNumbers {

	public static void main(String[] args) {
		
		String str = "nu11212mbers are there";
		String numberString = str.replaceAll("[^0-9]", "");
		String characterString = str.replaceAll("[0-9]", "");
		String captial = str.toUpperCase();
		System.out.println(numberString);
		System.out.println(characterString);
		System.out.println(captial);
		
//		String numstring = str.replaceAll("\\D+", "");
//		System.out.println(numstring);
	   
		

	}

}
