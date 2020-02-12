import java.util.*;

public class BinTree {
	private Node root;

	BinTree() {
		this.root = null;
	}

	public void insert(int D) {
		Node temp = new Node(D);

		if (root == null) {
			this.root = temp;
		} else {
			Node current = root;
			Node parent;

			while (true) {

				parent = current;

				if (D < current.data) { // left-down
					current = current.Lchild;

					if (current == null) {
						parent.Lchild = temp;
						return;
					}
				} else if (D > current.data) { // right-down
					current = current.Rchild;

					if (current == null) {
						parent.Rchild = temp;
						return;
					}

				} else if (D == current.data){ // duplication
					current.freq++;
					return;
				}

			}

		}
	}
	
	public boolean find(int key){
		Node parent=this.root;
		
		while(true){
			if(parent == null){
				break;
			}else if(key<parent.data){
				parent=parent.Lchild;
			}else if(key>parent.data){
				parent=parent.Rchild;
			}else if(key == parent.data){
				System.out.println(key+" Exists in this tree");
				return true;
			}
		}
		
		System.out.println(key+" doesn't exist in this tree");
		return false;
	}
	
	//minimum entry in the tree
	public int first(){
		 Node parent=this.root;
		 if(parent == null){
			 System.out.println("The tree is empty");
			 return 0;
		 }else{
			 while(parent.Lchild != null){
				 parent=parent.Lchild;
			 }
			 return parent.data;
		 }
	}
	
	//maximum entry in the tree
	public int last(){
		Node parent=this.root;
		 if(parent == null){
			 System.out.println("The tree is empty");
			 return 0;
		 }else{
			 while(parent.Rchild != null){
				 parent=parent.Rchild;
			 }
			 return parent.data;
		 }
	}
	

	public void display(){
		Scanner scan=new Scanner(System.in);
		if(this.root == null)
		{
			System.out.println("The tree is empty");
			}
		else{
			int i;
			System.out.println("DISPLAY MENU");
			System.out.println("Enter 1 for NLR");
			System.out.println("Enter 2 for LNR");
			System.out.println("Enter 3 for LRN");
			System.out.println("Enter 4 for BFS:");
			System.out.print("Choice: ");
			i=scan.nextInt();
			
			if(i==1){
				System.out.println("Tree as per NLR SCHEME");
				preOrder(this.root);
			}else if(i==2){
				System.out.println("Tree as per LNR SCHEME");
				inOrder(this.root);
			}else if(i==3){
				System.out.println("Tree as per LRN SCHEME");
				postOrder(this.root);
			}else if(i==4){
				
			}else{
				System.out.println("Invalid Option");
			}
		}
		
	}

	private void preOrder(Node localParent){//NLR
		if(localParent != null){
			localParent.printNode();
			preOrder(localParent.Lchild);
			preOrder(localParent.Rchild);
			
		}
	}
	private void inOrder(Node localParent){//LNR
		if(localParent != null){
			inOrder(localParent.Lchild);
			localParent.printNode();
			inOrder(localParent.Rchild);
			
		}
	}
	private void postOrder(Node localParent){//LRN
		if(localParent != null){
			postOrder(localParent.Lchild);
			postOrder(localParent.Rchild);
			localParent.printNode();
			
		}
	}

	//inorder successor
	
	private Node I_O_successor(Node newRoot){
		
		Node parent=newRoot;
		Node successor=newRoot;
		Node current=newRoot.Rchild;
		
		while(current != null){
			parent=successor;
			successor=current;
			current=current.Lchild;
		}
		
		if(successor != newRoot.Rchild){
			parent.Lchild=successor.Rchild;
			successor.Rchild=newRoot.Rchild;
		}
		//System.out.println(successor.data+" asdasdas");
		return successor;
	}
	
	//deleting a node
	public boolean free(int key){
		Node current = this.root;
		Node parent  = this.root;
		boolean isCurrentLeft=true;
		
		while(current.data != key){
			parent = current;
			if(key<current.data){
				isCurrentLeft=true;
				current=current.Lchild;
			}else{
				isCurrentLeft=false;
				current=current.Rchild;
			}
			if(current==null){
				return false;
			}
		}
		
		
		//case_1(The Node Has No children)
		if(current.Lchild==null && current.Rchild==null){
			if(current==root){
				this.root=null;
			}else if(isCurrentLeft){
				parent.Lchild=null;
			}else{
				parent.Rchild=null;
			}
		}else if(current.Rchild == null){	//case_2(The Node has one child)
			if(current==root){
				root=current.Lchild;
			}else if(isCurrentLeft){
				parent.Lchild=current.Lchild;
			}else{
				parent.Lchild=current.Rchild;
			}
		}else if(current.Lchild==null){
			if(current==root){
				root=current.Rchild;
			}else if(isCurrentLeft){
				parent.Lchild=current.Rchild;
			}else{
				parent.Rchild=current.Rchild;
			}
		}else{	//case_3(the node has 2 children)
			//first lets fetch the inorder successor to this node (that is to be deleted)
		
			Node successor = I_O_successor(current);
			if(current == root){
				successor.Lchild=root.Lchild;
				this.root=successor;
			}else if(isCurrentLeft){
				parent.Lchild=successor;
			}else{
				parent.Rchild=successor;
				successor.Lchild=current.Lchild;
			}
		}
		
		return true;
		
	}
}