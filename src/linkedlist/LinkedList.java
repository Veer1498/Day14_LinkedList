package linkedlist;

public class LinkedList {
	public Node addNode(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
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
	 public void printLinkedList(Node head) {
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
