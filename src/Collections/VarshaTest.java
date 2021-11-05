package Collections;

import java.util.*;



public class VarshaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = new ArrayList<String>(Arrays.asList("AJAY","Biju","Chirag","Deepak"));
		List<String> l2 = new ArrayList<String>();

		String name = "DBCA";
		for(int i=0;i<name.length();i++)
		{
			for(int k=0;k<l1.size();k++)
			{
				String str = l1.get(k);
				if(str.charAt(0)==name.charAt(i))
					l2.add(str);
			}
		}
		
		System.out.println(l2);
		
	}

}
