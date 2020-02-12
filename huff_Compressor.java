///class for compressing data

import java.util.*;
import java.io.*;

public class Compressor {
	Huffmans_Tree tree; // huffman's tree object
	PriorityQ PQ; // priority queue aid - de - tree built
	Freq_Link_List FLL; // frequency linked list object

	Compressor() {
		PQ = new PriorityQ(256); // makes a priority queue of 256
		tree = new Huffmans_Tree(); // makes an empty tree
		FLL = new Freq_Link_List(); // a new frequency linked list

	}

	public void ListToPriorityQ(Freq_Link_List temp) {
		FLL.CopyList(temp); // instantiates this.frequency linked list by
							// copying the built_up one

		List_Node current = FLL.getPointerToHead(); // gets a pointer to the
													// head

		while (current != null) { // initializes the entire priority queue with
									// the objects found in the frequency linked
									// list
			Node newNode = new Node(current.letter, current.get_Frequency());
			PQ.EnQueue(newNode);
			current = current.next;
		}

		

	}

	public void Tree_Construct() {
//TWO DEQUEUES AND AN ENQUEUE FOR THE TREE CONSTRUCTION
		while (PQ.items != 1) {
			Node A = this.PQ.DeQueue();
			Node B = this.PQ.DeQueue();
			Node temp = tree.conceive_parent(A, B);
			PQ.EnQueue(temp);
		}

		// copies the last found only node in the priority queue
		tree.copyTree(PQ.DeQueue());
		
		tree.DefinePath();
		tree.SHOW_ARRAY();//loads the path file into a 2D array
		
	}

}
