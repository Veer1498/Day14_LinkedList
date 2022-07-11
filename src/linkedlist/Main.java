package linkedlist;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Welcome();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter \n1.Add \n2.Append \n3.Insert Between \n4.Delete FirstNode");
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
		 }
	 }
	 
	 public static void Welcome() {
		 System.out.println("Welcome to the Linkedlist Program");
	 }
}
