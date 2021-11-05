package String_Number_Programs;

import org.testng.annotations.Test;

public class Fibonacci {

	@Test
	public void fib()
	{
		int n=4;
		
		int [] a = new int[n];
		
		
		
		if(n>2)
		{	
			a[0] =0;
			a[1]=1;
		for(int i=2;i<a.length;i++)
		{
			a[i] = a[i-1] + a[i-2];
			
		}
		}
		
		if(n==1)
		{	
		a[0] =0;
		System.out.println("Fibonanic series is "+a[0]);
		}
		else if(n==2) 
		{	
		
		System.out.println("Fibonanic series is "+a[0] +" "+a[1]);	
		}
		else {
			
			System.out.print("Fibonanic series is ");	
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");	
			}
			
		}
		
	}
}
