package linkedlist;
/**
 * 
 * @author singa
 *
 */
public class OperationsDoing {
	/**
	 * 
	 * @return- list data.
	 */
	//Add Data at First Method
	public static LinkedList addDataFirst() {
		/*
		 * Calling the Methods from LinkedList Class
		 * inserting data one by one in add Data Method
		 * print the list
		 * return the list values for further use
		 */
        LinkedList list = new LinkedList();
		 	list.addNode(70);
	        list.addNode(30);
	        list.addNode(56); 
	        System.out.print("The data Inserted in Linked List is : ");
	        list.printLinkedList();
			return list;
	}
	
	//Add Data at Last Method
	public static LinkedList addDataLast() {
		/*
		 * Calling the Methods from LinkedList Class
		 * inserting data one by one in append Node Method
		 * print the list
		 * return the list values for further use
		 */
		 LinkedList list = new LinkedList();
		 	list.appendNode(70);
	        list.appendNode(30);
	        list.appendNode(56); 
	        list.printLinkedList();
			return list;
	}
	
	//Insert Between Two Numbers Method
	public static void insertBtw() {
		/*
		 * Calling the Methods from LinkedList Class
		 * inserting data one by one in addNode Method
		 * print the list
		 * return the list values for further use
		 * 
		 */
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
	
	//Delete First Node Method
	
	public static void deleteFirstNode() {
		 LinkedList list = addDataFirst();
		 list.pop();
		 list.printLinkedList();
	}
	
	// Delete Last Node Method
	public static void deleteLastNode() {
		 LinkedList list = addDataFirst();
		 list.popLast();
		 list.printLinkedList();
	}
	
	//Search Node based on value inserted
	public static void findNode() {
		LinkedList linkedList = addDataFirst();
		linkedList.search(30);
	}
	
	// Search and Insert
	public static void findNodeInsert() {
		LinkedList linkedList = addDataFirst();
		Node newNode =new Node(40);
		Node prvNode = linkedList.searchInsert(30, newNode);
		System.out.print("Newly Added data in List : ");
		linkedList.printLinkedList();
		
	}
	

}
