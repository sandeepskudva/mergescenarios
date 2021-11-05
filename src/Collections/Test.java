package Collections;

public class Test {
	
	public static void reverseString() {
		String name = "varsha", rev="",rev1="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
		StringBuilder str = new StringBuilder();
		str.append(rev);
		str.reverse();
		System.out.println(str);
		rev = "sstr123%ty6$";
		for(int i=0;i<rev.length();i++)
		{
			rev1 = rev1 + rev.charAt(i);
			if(i==rev.length()-1)
				break;
			if(rev.charAt(i)==rev.charAt(i+1))
				i++;
			
		}
		System.out.println(rev1);
		name = rev.replaceAll("[0-9A-Za-z]","");
		System.out.println(name);
		
		for(int i=0;i<name.length();i++)
		{
			//System.out.println(name.charAt(i));
			for(int j=0;j<rev.length();j++)
			{
				//System.out.println(name.charAt(i));
				if(name.charAt(i)==rev.charAt(j))
					System.out.println(rev.indexOf(rev.charAt(j)));
					
			}
		}
		String name2 = "iint",name3="";
		rev1="";
		for(int i=0;i<name2.length();i++)
		{
			rev1 = rev1 + name2.charAt(i);
			if(i==name2.length()-1)
				break;
			if(name2.charAt(i)==name2.charAt(i+1))
				i++;
			
		}
		System.out.println("name2: " + rev1);
		for(int i=0;i<rev1.length();i++)
		{
			for(int k=0;k<=i;k++)
			{
				name3 = name3+ rev1.charAt(i);
			}
		}
		System.out.println(name3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();
	}

}
