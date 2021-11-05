package String_Number_Programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=555;		
		int reverse =0;
		int temp=number;
		int rem =0;
		
		while(temp >0)
		{
			rem = temp%10;
			reverse = reverse + rem * rem * rem;
			temp = temp/10; 
			
		}
		
		System.out.println(reverse);
		
	}

}
