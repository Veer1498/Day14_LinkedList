package linkedlist;
import java.util.Scanner;
/**
 * 
 * LinkedList Program
 * @author Veer.singa
 *
 */
public class Main {
	/*
	 * This is the Main Class of the Whole Linked List Program
	 */
	 public static void main(String[] args) {
		 /*
		  * Called Welcome Method
		  * Took Scanner to select which method to Perform
		  * Calling all Methods Created in Operations.
		  * 
		  */
		 Welcome();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter \n1.Add \n2.Append \n3.Insert Between"
		 					+ " \n4.Delete FirstNode \n5.Delete LastNode"
		 					+ "\n6.Find Node by Value Given \n7.Search and Insert"
		 					+ "\n8.Search and Delete a Node");
		 int n = sc.nextInt();
		 switch(n) {
		 case 1 :
			 OperationsDoing.addDataFirst();
			 break;
		 case 2 :
			 OperationsDoing.addDataLast();
			 break;
		 case 3 :
			 OperationsDoing.insertBtw();
			 break;
		 case 4 :
			 OperationsDoing.deleteFirstNode();
			 break;
		 case 5 :
			 OperationsDoing.deleteLastNode();
			 break;
		 case 6 :
			 OperationsDoing.findNode();
			 break;
		 case 7 :
			 OperationsDoing.findNodeInsert();
		 case 8 :
			 OperationsDoing.findNodeDeleteShowSize();
		 }
	 }
	 
	 //Welcome method
	 public static void Welcome() {
		 System.out.println("Welcome to the Linkedlist Program");
	 }
}
