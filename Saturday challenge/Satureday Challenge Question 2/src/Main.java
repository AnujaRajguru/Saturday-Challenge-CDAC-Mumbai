
public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(15);		
		ll.insert(20);
	    ll.insertAt(30,2);
		ll.insert(40);
		System.out.println(ll);
		ll.swapAdjacentNode();
		System.out.println(ll);
		}

}
