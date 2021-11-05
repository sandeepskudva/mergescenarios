package Collections;

import java.util.*;

import javax.swing.plaf.multi.MultiInternalFrameUI;








public class arrayListProgram {

	public static void main(String[] args) {
		
		List <Integer> s1 = new ArrayList <Integer>(Arrays.asList(4,2,5,1));
			
		System.out.println("Insertion order is "+s1);
		s1.remove(1);
		System.out.println("after removing "+s1);
		s1.set(2,3);
		System.out.println("after replacing "+s1);
		Boolean ispresent = s1.contains(6);
		System.out.println("is present is "+ispresent);
		
		
	
		
		
		
		
		
	}

}
