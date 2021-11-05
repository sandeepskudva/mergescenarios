package String_Number_Programs;

import org.testng.annotations.Test;

public class reverseInteger {

	@Test
	public void reverseInteger() {
	
		int number = 66066;
		
		int temp =number;
		int reverse= 0;
		int remainder=0;
		
		
		while(temp>0)
		{
		 remainder = temp % 10;
		 reverse = reverse * 10 + remainder;
		 temp = temp/10;
		
		}
		 System.out.println(reverse);
		 
		 if(number==reverse)
		 System.out.println("Palindrome");
		 else System.out.println("Not a Palindrome");
	}
}
