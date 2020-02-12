 
public class CQ {

	
	public static void main(String[] args) {
		CircularQueue cq=new CircularQueue(10);
		
		cq.Enqueue(40);
		cq.Enqueue(80);
		cq.Enqueue(90);
		cq.Enqueue(100);
		cq.Enqueue(110);
		
		//System.out.println(cq.peek());

		System.out.println(cq.Dequeue());
		System.out.println(cq.Dequeue());
		System.out.println(cq.Dequeue());
		System.out.println(cq.Dequeue());
		System.out.println(cq.Dequeue());
		System.out.println(cq.Dequeue());
		cq.Dequeue();
		cq.Enqueue(1000);
		
		cq.Dequeue();
		cq.Dequeue();
		
		cq.Dequeue();
		cq.Dequeue();
		

	}

}
