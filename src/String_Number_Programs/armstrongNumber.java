package String_Number_Programs;

import org.testng.annotations.Test;

public class armstrongNumber {
	
	@Test
	public void checkArmstrong()
	{
		int n=407;
		int temp = n;
		int remainder =0;
		int arm =0;
		
		while(temp>0)
		{
			remainder = temp%10;
			arm=arm + remainder *  remainder * remainder;
			temp= temp/10;
			
		}
		
		System.out.println("sum of cubes is "+arm);
		
		if(arm==n)
		System.out.println("armstrong");
		else {
			System.out.println("not armstrong");	
		}
		
	}

}
