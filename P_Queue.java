public class P_Queue {
	private int[] Queue;
	private int size;
	private int N;

	P_Queue(int s) {
		size = s;
		Queue = new int[size];
		N = 0;
	}

	boolean isEmpty(){
		return (N==0);
	}
	
	boolean isFull(){
		return (N==size);
	}
	
	void Enqueue(int val) {
		int i;
		if (N == 0) {
			Queue[N++] = val;
		} else {
			for (i = N - 1; i >= 0; i--) {
				if (val > Queue[i]) {
					Queue[i + 1] = Queue[i];
				} else {
					break;
				}
			}
			Queue[i+1]=val;
			N++;
		}
	}
	
	int Dequeue(){
		return (Queue[--N]);
	}
	
	
}
