
public class Driver {

	
	public static void main(String[] args) {
		Doubly_Linked_List list=new Doubly_Linked_List();
		

		list.display();
		
		list.insertTop(50);
		list.insertTop(40);
		list.insertTop(30);
		list.insertTop(20);
		list.insertTop(10);
		list.insertTail(60);
		list.insertTail(70);
		list.insertTail(80);
		list.insertTail(90);
		list.insertTail(100);

		list.display();
		list.displayBackwards();
		
		
		list.delete(70);
		list.display();

	}

}
