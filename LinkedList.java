package bridgeLab;

class Node{
	int data;
	Node next;
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList <E>implements IStack, IQueue{
	Node head;



	@Override
	public void deQueue() {
		Node temp = head;
		head = temp.next;

	}

	@Override
	public void pop() {
		Node temp = head;
		Node prev = head;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}


	@Override
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public void displayNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

	public void peep(int data) {
		Node temp = head ;
		if(head.data == data) {
			temp = head;
			System.out.println("Your Data :" + temp.data);
		}else {
			while(temp.next != null) {
				temp = temp.next;
				if(temp.data == data) {
					System.out.println("Your data :" + temp.data);
				}
			}
		}
		if(head.data != data) {
			System.out.println("Invalid Node Details");
		}

	}


	@Override
	public void enQueue(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	@Override
	public void peep() {
		// TODO Auto-generated method stub
		
	}

}
