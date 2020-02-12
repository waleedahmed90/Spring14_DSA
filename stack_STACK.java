public class STACK {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public STACK(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public boolean isFull() {
		
		return (top == maxSize - 1);
	}

	public void push(int element) {
		if (!isFull()) {
			stackArray[++top] = element;
			//System.out.println("Done");
		} else {
			System.out.println("Sorry. The stack is full");
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int /*void*/ pop() {
		int temp;
		if (!isEmpty()) {
			temp=stackArray[top--];
			return temp;
			//System.out.println(stackArray[top--]);
		} else {
			System.out.println("Sorry. The stack is empty");
		}
		temp=stackArray[top--];
		
		return temp;
	}

	public void peek() {
		if (!isEmpty()) {
			System.out.println("Top Element: " + stackArray[top]);
		} else {
			System.out.println("Sorry. The stack is empty");
		}
	}
}
