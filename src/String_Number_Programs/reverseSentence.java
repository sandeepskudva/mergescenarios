package String_Number_Programs;

import java.util.List;

import org.testng.annotations.Test;

public class reverseSentence {
	
	@Test(invocationCount=5)
	public void nameReverse()
	{
	 String sentence = "sandeep is good";
	 String reverse="";
	 String[]a = sentence.split(" ");
	 
	 for(int i=0;i<a.length;i++)
	 {
		reverse = reverse + " "+reversestr(a[i]);
	 }
	 
	 System.out.println(reverse);
	 
	}


	public String reversestr(String str)
	{
	  String reverse ="";
	  for(int i=str.length()-1;i>=0;i--)
	  {
		reverse = reverse + str.charAt(i) ;
	  }
	  return reverse;
	}

}
