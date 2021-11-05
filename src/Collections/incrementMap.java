package Collections;

import java.util.HashMap;
import java.util.Map;

public class incrementMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> HS = new HashMap<Character, Integer> ();
		String occ = "abcdefghijklmnopqrstubvwxyza";
		int count;
		char[] car = occ.toCharArray();
		
		for(char c: car)
		{
			if(HS.containsKey(c))
			{
				HS.put(c, (HS.get(c)+1));
			}
			else {
				HS.put(c, 1);
			}
		}
		
		for(Map.Entry entry : HS.entrySet())
		{
		   System.out.println(entry.getKey() +" "+ entry.getValue());
		}

	}

}
