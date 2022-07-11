package linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	
	public Node addNode(int data) {
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
	
	public void appendNode(int data) {
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
	
	public void insertBetween(Node prevNode, Node newNode) {
		Node tempNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = tempNode;
 		
	}
	
	public void pop() {
		this.head = this.head.next;
	}
	
	public void popLast()  {
		Node tempNode = head;
		while(!tempNode.next.equals(tail)) {
			tempNode = tempNode.next;
		}
		this.tail = tempNode;
		tempNode.next = null;
	}
	
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
