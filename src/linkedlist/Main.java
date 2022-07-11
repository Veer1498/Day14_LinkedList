package linkedlist;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Welcome();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1.Add 2.Append");
		 int n = sc.nextInt();
		 switch(n) {
		 case 1 :
			 OperationsDoing.addDataFirst();
			 break;
		 case 2 :
			 OperationsDoing.addDataLast();
			 break;
		 }
	 }
	 
	 public static void Welcome() {
		 System.out.println("Welcome to the Linkedlist Program");
	 }
}
