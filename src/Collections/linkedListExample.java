package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		List<String> list 	= new LinkedList<String>();
		list.add("Andrew");
		list.add("Bond");
		list.add("Carter");
		list.add("Doug");
		
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
		System.out.println(list.get(0));
		System.out.println(list1.get(1));
	}

}
