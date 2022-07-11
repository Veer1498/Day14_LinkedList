package linkedlist;

public class OperationsDoing {
	public static void addDataFirst() {
        LinkedList list = new LinkedList();
		 	list.addNode(70);
	        list.addNode(30);
	        list.addNode(56); 
	        list.printLinkedList();
	}
	public static void addDataLast() {
		 LinkedList list = new LinkedList();
		 	list.appendNode(56);
	        list.appendNode(30);
	        list.appendNode(70); 
	        list.printLinkedList();
	}
	public static void insertBtw() {
		 LinkedList list = new LinkedList();
		 	Node secNode = list.addNode(70);
		 	Node firNode = list.addNode(56);
		 	Node newNode = new Node(30);
		 	System.out.println("Before Insertion");
	        list.printLinkedList();
	        list.insertBetween(firNode, newNode);
		 	System.out.println("After Insertion");
	        list.printLinkedList();
	}
	

}
