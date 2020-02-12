public class LinkList {
	private Link first; // reference to the first Link

	public void LinkList() { // default constructor
		this.first = null;
	}

	public boolean isEmpty() { // checks if the list is empty
		return (first == null);
	}

	// insertion at the beginning of the List

	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = this.first; // the newLink points to the old first
		this.first = newLink; // first-->newLink;
	}

	// delete first method

	public Link deleteFirst() {
		Link temp = this.first;
		this.first = this.first.next;
		return temp;
	}

	// displays list

	void DisplayList() {
		Link current = this.first;

		while (!(current == null)) {
			current.displayLink();
			current = current.next;
		}
	}

	// insert at the end of the list

	void insertEnd(int id, double dd) {
		Link temp = new Link(id, dd);
		Link current = this.first;

		while (true) {
			if (first == null) {
				first = temp;
				return;
			}

			if (current.next == null) {
				current.next = temp;
				temp.next = null;
				break;
			} else {
				current = current.next;
			}
		}

	}

	// find a node
	// works for the 'integer' type
	public Link find(int key) {
		Link current = first;
		int count = 0;
		while (current.iData != key) {
			if (current.next == null) {
				return null; // you have reached the end of the list and desired
								// node isn't found
			} else {
				current = current.next;
				// System.out.println(count);
				count++;
			}
		}
		System.out.print("Node: " + (count + 1) + ":::::::::");
		return current;
	}

	// over loaded find function
	// works for 'double' type

	public Link find(double key) {
		Link current = first;
		int count = 0;
		while (current.dData != key) {
			if (current.next == null) {
				return null; // you have reached the end of the list and desired
								// node isn't found
			} else {
				current = current.next;
				// System.out.println(count);
				count++;
			}
		}
		System.out.print("Node: " + (count + 1) + ":::::::::");
		return current;
	}

	// deleting a specified link

	public Link delete(int key) {

		Link current = this.first;
		Link previous = this.first;

		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}

		// if the node has been found
		
		
		if (current == first) {
			first = first.next; // point the pointer first to the 2nd node
		} else {
			previous.next = current.next;
		}

		return current;
	}

	// overloaded delete function for the double type
	public Link delete(double key) {

		Link current = this.first;
		Link previous = this.first;

		while (current.dData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}

		// if the node has been found
		if (current == first) {
			first = first.next; // point the pointer first to the 2nd node
		} else {
			previous.next = current.next;
		}

		return current;
	}

	// insertion somewhere at the middle of the list

	public void insertAfter(int key, int id, double dd) {
		Link current = this.first;
		//Link previous = this.first;

		boolean flag=false;
		
		while (current!=null) {
			if(current.iData==key){
				Link temp=new Link(id,dd);
			//	previous.next=temp;
				temp.next=current.next;
				current.next=temp;
				System.out.println("\n\nInsertion Successful");
				flag=true;
				break;
				
			}else{
				current=current.next;
			}
		}
		
		if(!flag){
			System.out.println("Link not found. Couldn't insert. Sorry");
		}

	}
	
	//insert before
	public void insertBefore(int key, int id, double dd) {
		Link current = this.first;
		Link previous = this.first;

		boolean flag=false;
		
		while (current!=null) {
			if(current.iData==key){
				Link temp=new Link(id,dd);
			//	previous.next=temp;
				temp.next=current.next;
				current.next=temp;
				System.out.println("\n\nInsertion Successful");
				flag=true;
				break;
				
			}else{
				current=current.next;
			}
		}
		
		if(!flag){
			System.out.println("Link not found. Couldn't insert. Sorry");
		}

	}

}
