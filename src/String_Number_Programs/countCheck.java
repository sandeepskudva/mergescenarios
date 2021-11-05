package String_Number_Programs;



public class countCheck {

	public static void main(String[] args)
	{
		String sentence = "India 1 aaaaa@#$";
		int digit=0;
		int letter=0;
		int spaces=0;
		int otherChar =0;
		
//		for(int i=0;i<sentence.length();i++)
//		{
//			if(Character.isDigit(sentence.charAt(i)))
//			{
//				digit++;
//			}
//			else if(Character.isLetter(sentence.charAt(i)))
//			{
//				letter++;
//			}
//			else if(sentence.charAt(i)==' ')
//			{
//				spaces++;		
//			}
//			else
//			{
//				otherChar++;
//			}
//			
//		}
//		
		letter = (sentence.replaceAll("[^a-zA-Z]","")).length();
		digit = (sentence.replaceAll("[^0-9]","")).length();
		spaces = sentence.length() -(sentence.replaceAll(" ","")).length();
		otherChar =(sentence.replaceAll("[a-zA-Z0-9]","")).replaceAll(" ","").length();
		
		System.out.println("Digit count is "+digit);
		System.out.println("Alphabet count is "+letter);
		System.out.println("space count is "+spaces);
		System.out.println("Other Character count is "+otherChar);
	}

}
