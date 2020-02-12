public class CircularQueue {
	int maxSize;
	int[] queue;
	int rear;
	int front;
	private static int counter=0;	//static and no accessible via main function
	CircularQueue(int mS) {
		maxSize = mS;
		queue = new int[maxSize];
		front = -1;
		rear = -1;
	}

	boolean isEmpty() {
		return ((front == -1) && (rear == -1));
	}

	boolean isFull() {
		return (counter==maxSize);
	}

	public int peek() {
		if (!isEmpty()) {
			return (queue[front]);
		} else {
			System.out.println("Queue is empty"); 
			return -10000;
		}
	}

	public void Enqueue(int k) {
		if (!isFull()) {
			if(rear==-1 && front==-1){
				front=0;
				queue[++rear]=k;
			}else if ((front == rear) && (rear == maxSize - 1)) {
				rear = 0;
				queue[rear] = k;
			} else {
				queue[++rear] = k;
			}
			counter++;
		} else {
			System.out.println("Sorry the queue is full");
		}
	}

	public int Dequeue() {
		if (!isEmpty()) {
			int temp; // this will store the value to be returned
			if (front == rear) {
				temp = queue[front];
				front = -1;
				rear = -1;
				counter--;
				return temp;
			} else if (front == maxSize - 1) {
				temp = queue[front];
				front = 0;
				counter--;
				return temp;
			} else {
				counter--;
				return (queue[front++]);
			}
		} else {
			System.out.println("Queue is Empty");
			return -10000;
		}
	}

}
