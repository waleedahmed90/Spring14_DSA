//;;tree's Node

public class Node {
	char letter;
	int freq;
	Node LChild;
	Node RChild;

	Node(char l, int f) {
		this.letter = l;
		this.freq = f;
		LChild = null;
		RChild = null;
	}
	
	void DispayNode(){
		System.out.println(this.letter+" : "+this.freq);
	}
}