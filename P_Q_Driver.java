
public class Driver {

	
	public static void main(String[] args) {
		P_Queue pq=new P_Queue(10);

		pq.Enqueue(10);
		pq.Enqueue(8);
		pq.Enqueue(4);
		pq.Enqueue(7);
		pq.Enqueue(9);
		pq.Enqueue(2);
		pq.Enqueue(5);
		pq.Enqueue(3);
		pq.Enqueue(6);
		pq.Enqueue(1);
		
		
		while(!pq.isEmpty()){
			System.out.println(pq.Dequeue());
		}
		

	}

}
