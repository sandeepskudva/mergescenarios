package Collections;

import java.util.Iterator;
import java.util.Vector;


public class vectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Vector<String> v 	= new Vector<String>();
		v.add("Andrew");
		v.add("Bond");
		v.add("Carter");
		v.add("Doug");
		
		Vector <Integer> v1 	= new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(1);
		
		
		Iterator itr = v.iterator();
		Iterator intitr = v1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(intitr.hasNext()) {
			System.out.println(intitr.next());
		}
		System.out.println(v.get(0));
		System.out.println(v1.get(1));
	}

}
