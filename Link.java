
public class Link {
	int iData;	//the integer type data
	double dData;	//the double type data
	Link next;		//link to the next 'Link'
	
	public Link(int id, double dd){	//the constructor with parameters
		this.iData=id;
		this.dData=dd;
		this.next=null;
	}
	
	public void displayLink(){
		System.out.print("{ "+this.iData+","+this.dData+" } --> ");
	}
}//end class Link
