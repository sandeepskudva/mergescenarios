package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {

	public static void main(String[] args) {
		
		String sentence = "India is my country";
		int temp=0;
		
			
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] carray = sentence.toCharArray();
		
//		for(char c : carray)
//		{
//			if(mp.containsKey(c))
//			{
//				mp.put(c, mp.get(c)+1);
//			}
//			else
//			{
//				mp.put(c, 1);
//			}
//		}
		
		
		for(int i=0;i<carray.length;i++)
		{
			if(mp.containsKey(carray[i]))
				{
					mp.put(carray[i], mp.get(carray[i])+1);
				}
				else
				{
					mp.put(carray[i], 1);
				}
		}
		
		Character ch = null;
		
		for (Map.Entry e : mp.entrySet()) {
            System.out.print(e.getKey() + "-" + e.getValue()+";");
            if(temp <(int) e.getValue())
            {
            temp =(int) e.getValue();        
            ch = (Character) e.getKey();
            }
        }
		System.out.println(sentence);
		 System.out.println("Index is "+sentence.indexOf(ch));
		 System.out.println("Highest number of occurance is "+temp);
		 System.out.println("Character is "+ch);
		 System.out.println("Entry set is "+mp);
	}

}
