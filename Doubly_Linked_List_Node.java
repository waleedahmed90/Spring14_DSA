
public class Node {
	int data;
	Node next;
	Node previous;
	
	Node(int d){
		data=d;
		next=null;
		previous=null;
	}
	
	void PrintNode(){
		System.out.print(this.data);
	}
}
