package Collections;


import java.util.Iterator;
import java.util.Stack;

public class stackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Stack<String> st 	= new Stack<String>();
		st.add("Andrew");
		st.add("Bond");
		st.add("Carter");
		st.add("Doug");
		st.pop();
		Stack<Integer> stn	= new Stack<Integer>();
		stn.add(1);
		stn.add(2);
		stn.add(3);
		stn.add(1);
		
		
		Iterator itr = st.iterator();
		Iterator intitr = stn.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(intitr.hasNext()) {
			System.out.println(intitr.next());
		}
		System.out.println(st.get(0));
		System.out.println(stn.get(1));
	}

}
