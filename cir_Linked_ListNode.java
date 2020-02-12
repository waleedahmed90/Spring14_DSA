
public class Node {
	
	int data;
	Node next;
	
	Node(int d){
		this.data=d;
		this.next=null;
	}
	
	public void displayNode(){
		System.out.print(this.data+" -> ");
	}

}
