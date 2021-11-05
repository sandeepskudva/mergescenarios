package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		ArrayList<String> list 	= new ArrayList<String>();
		list.add("Andrew");
		list.add("Doug");
		list.add("Carter");
		list.add("Bond");
		
		ArrayList<Integer> list1 	= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		
		
		Iterator itr = list.iterator();
		Iterator intitr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(intitr.hasNext()) {
			System.out.println(intitr.next());
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list1);
		System.out.println(list1);
		
	}

}
