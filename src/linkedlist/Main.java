package linkedlist;

public class Main {
	 public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        Welcome();
	        Node head = list.addNode(null, 56);
	        head = list.addNode(head, 30);
	        head = list.addNode(head, 70); 
	        list.printLinkedList(head);
	 }
	 
	 public static void Welcome() {
		 System.out.println("Welcome to the Linkedlist Program");
	 }
}
