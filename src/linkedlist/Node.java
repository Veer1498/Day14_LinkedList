package linkedlist;
/**
 * 
 * Linked List Program
 * @author Veer.singa
 *
 */

//Class Node
public class Node {
	/**
	 * Created a Class Node
	 * initialized two Variables.
	 * 
	 */
	int data;
	Node next;
	
	//Constructor Node Class
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		
	
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
