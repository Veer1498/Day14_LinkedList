package linkedlist;

//Class Linked List
public class LinkedList {
	Node head;
	Node tail;
/**
 * 
 * @param data
 * @return-newNode 
 */
	//AddNode Method
	public Node addNode(int data) {
		/*
		 * created and Object of Class Node Passing Data.
		 * Created IF Else Condition
		 * If - There is Nothing in List Creates a New Node,
		 * Else - The Head is Stored in Temp, and Creates Head with New Node 
		 * and Temp will become NextNode for New Node.
		 * It Returns newNode.
		 * 
		 */
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else{
	         Node temp = head;  
	         this.head = newNode;
	            newNode.next = temp;
	        }
	        return newNode;
	    
	}
	// Append Node Method
	public void appendNode(int data) {
		/*
		 *  created and Object of Class Node Passing Data.
		 * Created IF Else Condition
		 * If - There is Nothing in List Creates a New Node,
		 * Else- Creates New Node at tail
		 */
		
		Node newNode =new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}
	//Insert Between Method
	public void insertBetween(Node prevNode, Node newNode) {
		/*
		 * Creates two New variables to insert btw
		 * temp is Previous node.next and next of prevNode is NewNode.
		 * Next of New Node is saved with temp 
		 */
		Node tempNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = tempNode;
 		
	}
	//Pop method
	public void pop() {
		this.head = this.head.next;
	}
	
	//Pop last method
	public void popLast()  {
		Node tempNode = head;
		while(!tempNode.next.equals(tail)) {
			tempNode = tempNode.next;
		}
		this.tail = tempNode;
		tempNode.next = null;
	}
	
	//Print The Linked List method
	 public void printLinkedList() {
	        Node temp = head;
	        if(temp == null) {
	            System.out.println("LinkedList is empty");
	        }else {
	            while(temp.next!=null) {
	                System.out.print(temp.data+" ");
	                temp = temp.next;
	            }
	            System.out.println(temp.data);
	        }
	    }
	

}
