////frequency linked list node

public class List_Node {
	public char letter;
	private int freq;
	public List_Node next;

	public List_Node(char l) {
		this.letter = l;
		this.freq = 1;
		this.next = null;
	}

	public void update_Frequency() {
		this.freq++;
	}

	public int get_Frequency() {
		return this.freq;
	}

	public void printNode() {
		System.out.println(this.letter + " : " + this.freq);
	}
}
