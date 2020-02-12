///frequency linked list class 

public class Freq_Link_List {
	private List_Node head;

	Freq_Link_List() {
		this.head = null;
	}

	public void insert(List_Node temp) {

		if (head == null) {
			head = temp;
		} else {
			List_Node current = head;

			while (current.next != null) {
				if (current.letter == temp.letter) {
					current.update_Frequency();
					return;
				}
				current = current.next;
			}
			if(current.letter == temp.letter){
				current.update_Frequency();
				return;
			}
			current.next = temp;
		}
	}

	public void total_freq() {
		List_Node current = head;
		int net = 0;

		while (current != null) {
			net += current.get_Frequency();
			current = current.next;
		}

		System.out.println("Total characters= " + net);
	}

	void CopyList(Freq_Link_List temp) {
		this.head = temp.head;
	}

	List_Node getPointerToHead() {
		List_Node temp = this.head;
		return temp;
	}

	void displayList() {
		List_Node current = head;

		while (current != null) {
			current.printNode();
			current = current.next;
		}
	}
}
