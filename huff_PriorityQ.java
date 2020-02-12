//;;;priority queue made up of tree nodes
public class PriorityQ {
	private int size;
	private Node[] Array;
	public int items;	//make private later

	public PriorityQ(int s) {
		this.size = s;
		this.Array = new Node[size];
		this.items = 0;
	}

	public void EnQueue(Node key) {
		int j;
		if (!isFull()) {
			if (items == 0) {
				Array[items++] = key;
			} else {
				for (j = items - 1; j >= 0; j--) {
					if (key.freq > Array[j].freq) {
						Array[j + 1] = Array[j];
					} else {
						break;
					}
				}
				Array[j + 1] = key;
				items++;
			}
		} else {
			System.out.println("Can't Insert. Sorry the Queue is full.");
		}
	}

	public Node DeQueue() {
		if (!isEmpty()) {
			return Array[--items];
		} else {
			System.out.println("Can't return. Sorry the Queue is empty.");
			return null;
		}
	}

	public Node peek() {
		return Array[items - 1];
	}

	public boolean isEmpty() {
		return (items == 0);
	}

	public boolean isFull() {
		return (items == size);
	}
}
