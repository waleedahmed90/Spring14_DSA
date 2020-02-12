public class Doubly_Linked_List {
	private Node head;
	private Node tail;

	public Doubly_Linked_List() {
		head = null;
		tail = null;
	}

	boolean isEmpty() {
		return (head == null);
	}

	void insertTop(int val) {
		Node temp = new Node(val);

		if (isEmpty()) {
			head = temp;
			tail = temp;
		} else {
			head.previous = temp;
			temp.next = head;
			head = temp;
		}
	}

	void insertTail(int val) {
		Node temp = new Node(val);

		if (isEmpty()) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			temp.previous = tail;
			tail = temp;
		}
	}

	void deleteTop() {
		Node current = head;

		if (!isEmpty()) {
			if (head.next == null) {
				head = null;
				tail = null;
			} else {
				head.next.previous = null;
				head = head.next;
			}
		} else {
			System.out.println("List is empty");
		}
	}

	void deleteTail() {
		Node current = tail;
		if (!isEmpty()) {
			if (head.next == null) {
				tail = null;
				head = null;
			} else {
				tail.previous.next = null;
				tail = tail.previous;
			}
		} else {
			System.out.println("List is empty");
		}
	}

	boolean insertAfter(int key, int val) {
		Node temp = new Node(val);

		if (!isEmpty()) {
			Node current = head;
			while (current.data != key) {
				current = current.next;
				if (current == null) {
					return false;
				}
			}
			if (current == tail) {
				tail = temp;
				return true;
			} else {
				temp.next = current.next;
				current.next.previous = temp;
				temp.previous = current;
				current.next = temp;
				return true;
			}
		} else {
			System.out.println("sorry the list is empty");
			return false;
		}

	}

	public Node delete(int key) {
		Node current = head;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}

		if (current == head) {
			head = null;
			tail = null;
			return current;
		} else if (current == tail) {
			tail = current.previous;
			current.previous.next = null;
			current.previous = null;
			return current;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
			current.next = null;
			current.previous = null;
			return current;
		}
	}

	void display() {
		Node current = head;
		if (!isEmpty()) {
			while (current != null) {
				current.PrintNode();
				System.out.print("->");
				current = current.next;
			}
			System.out.println();
		} else {
			System.out.println("The List is Empty");
		}
	}
	
	void displayBackwards(){
		Node current = tail;
		if (!isEmpty()) {
			while (current != null) {
				current.PrintNode();
				System.out.print("->");
				current = current.previous;
			}
			System.out.println();
		} else {
			System.out.println("The List is Empty");
		}
	}
}
