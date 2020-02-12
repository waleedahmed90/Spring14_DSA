public class Cir_Linked_List {
	
	private Node head;

	//the constructor
	Cir_Linked_List() {
		this.head = null; // the_list_is_empty
	}

	//insertion_at_the_method
	public void insertAtEnd(int key) {
		Node temp = new Node(key);

		if (head == null) {
			head = temp;
			temp.next = head;
		} else {

			Node current = head;

			while (true) {
				if (current.next == head) {
					current.next = temp;
					temp.next = head;
					break;
				} else {
					current = current.next;
				}
			}
		}

	}

	//insertion_at_the_beginning
	public void insertAtBeg(int key) {
		Node temp = new Node(key);

		if (head == null) {
			head = temp;
			temp.next = head;
		} else {

			Node current = head;
			temp.next = head;
			// now update the tail pointer to the new head
			while (current.next != head) {
				current = current.next;
			}
			current.next = temp;
			head = temp;
		}

	}

	//deleting the last node
	public int DeleteLast() {
		//reconsider this code for genericism
		if (head == null) {
			System.out.println("Empty");
			return -1000;
		} else if (head.next == head) {
			int x = head.data;
			head.next = null;
			head = null;
			return x;
		} else {
			Node current = head;
			Node previous = head;

			while (current.next != head) {
				previous = current;
				current = current.next;
			}

			previous.next = head;
			current.next = null;

			return current.data;
		}
	}
	
	
	//deleting the first node
	public int DeleteFirst(){
		if(head == null){
			System.out.println("The list is empty");
			return -1000;
		}else if(head.next == head){
			int x=head.data;
			head.next=null;
			head=null;
			return x;
		}else{
			Node Temp = head;
			Node current = head;
			
			while(current.next != head){
				current = current.next;
			}
			
			head=head.next;
			current.next=head;
			Temp.next=null;
			return Temp.data;
		}
	}

	//printing the list method
	public void printList() {

		if (head == null) {
			System.out.println("the list is empty");
		} else {
			Node current = head;
			current.displayNode();
			while (current.next != head) {
				current = current.next;
				current.displayNode();
			}

			System.out.println();
		}

	}

}
