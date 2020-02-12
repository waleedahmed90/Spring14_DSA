
public class Driver {

	
	public static void main(String[] args) {
		LinkList A=new LinkList();
		
		A.insertEnd(1, 1.1);//(1)first one is always insert first....(2) not always like this. {/*Fixed*/}
		A.insertEnd(2, 2.2);
		A.insertEnd(3, 3.3);
		A.insertEnd(4, 4.4);
		A.insertEnd(5, 5.5);
		A.insertEnd(6, 6.6);
		A.insertEnd(7, 7.7);
		A.insertEnd(8, 8.8);
		A.insertEnd(9, 9.9);
		A.insertEnd(10, 10.10);
		A.insertEnd(11, 11.11);
		A.insertEnd(12, 12.12);
		
		System.out.println("Before Insertion");
		A.DisplayList();
		
		A.insertAfter(4, 60, 60.60);
	
		

		System.out.println("\nAfter Insertion");
		A.DisplayList();
		
		/*A.delete(1);
		A.delete(12.12);*/
		
		

		
		
	}

}
