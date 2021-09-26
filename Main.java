package bridgeLab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println(":: Welcome to LinkedList ::");
			System.out.println(":: Main Menu ::");
			System.out.println( " 1.Stack \n 2.Queue \n 3.Exit");
			int choice = scanner.nextInt();
			if(choice == 1) {
				showStackMenu();
			}else if(choice == 2) {
				showQueueMenu();
			}else if(choice == 3) {
				System.out.println("Thank you..!!");
				exit =true;
			}



		}

	}

	private static void showQueueMenu() {
		LinkedList list = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println(":: Queue Menu ::");
			System.out.println(" 1.Add Node  \n 2.Print Node \n 3.Delete Node \n 4.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: { System.out.println("Enter number of nodes you want to add :");
			       int node = scanner.nextInt();
			       for(int i = 0; i<node; i++) {
			    	   System.out.println("Enter data for node :");
			    	   int data = scanner.nextInt();
			    	   list.enQueue(data);
			       }
				break;
			}
			
			case 2: {
				System.out.println("Linked List :-");
				list.displayNode();
			}
			break;
			
			case 3:{
				list.deQueue();
			}
			break;
			
			case 4:{
				exit =true;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

	private static void showStackMenu() {
		LinkedList list = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println(":: Stack Menu ::");
			System.out.println(" 1.Add Node  \n 2.Print Node \n 3.Delete Node \n 4.Peep Data \n 5.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: { System.out.println("Enter number of nodes you want to add :");
			       int node = scanner.nextInt();
			       for(int i = 0; i<node; i++) {
			    	   System.out.println("Enter data for node :");
			    	   int data = scanner.nextInt();
			    	   list.push(data);
			       }
				break;
			}
			
			case 2: {
				System.out.println("Linked List :-");
				list.displayNode();
			}
			break;
			
			case 3:{
				list.pop();
			}
			break;
			
			case 4: {System.out.println("Enter Node you want to find :");
			        int data =scanner.nextInt();
			        list.peep(data);
				}
			break;
			
			case 5:{
				exit =true;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

		
	}

}
