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
		  else if(head != null){
	            Node temp = head;
	            while(temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        return head;
	    
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
