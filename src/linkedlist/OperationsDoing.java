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

}
