
public class Node {
	int data;
	Node Lchild;
	Node Rchild;
	int freq;
	
	
	Node(int d){
		this.data=d;
		this.Lchild=null;
		this.Rchild=null;
		freq=1;
	}
	
	void printNode(){
		System.out.println(this.data+" ");
	}
}
