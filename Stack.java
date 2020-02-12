
public class Stack {
	int maxSize;
	char []stackCharArr;
	int top;
	
	
	Stack(int mS){
		maxSize=mS;
		stackCharArr=new char[maxSize];
		top=-1;
	}
	
	void push(char x){
		if(top!=maxSize-1){
			stackCharArr[++top]=x;
		}else{
			System.out.println("Sorry the stack is full");
		}
	}
	
	char pop(){
		return stackCharArr[top--];
		
	}
	
	boolean isEmpty(){
		return (top==-1);
	}
	
}
