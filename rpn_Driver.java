public class Driver {

	public static void main(String[] args) {
		String str1 = "74/42*+";

		char[] temp = str1.toCharArray();

		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		
		
		int size = temp.length;

		STACK S = new STACK(size);
		
		
		int count = 0;
		int x;
		while (count < size) {
			int A, B;
			
			if (!(temp[count] == '+' || temp[count] == '-'
					|| temp[count] == '*' || temp[count] == '/')) {
				
				x=Character.getNumericValue(temp[count]);
				
				S.push(x);
				
				
				count++;
				
			} else {
				B = S.pop();
				A = S.pop();
				
				
				if (temp[count] == '+') {
					S.push(A + B);
				} else if (temp[count] == '-') {
					S.push(A - B);
				} else if (temp[count] == '*') {
					S.push(A * B);
				} else if (temp[count] == '/') {
					S.push(A / B);
				}
				count++;
			}
		}

		System.out.println("Answer: " + S.pop());

		/*
		 * STACK S = new STACK(10);
		 * 
		 * S.push(10); S.push(9); S.push(8); S.push(7); S.push(6); S.push(5);
		 * S.push(4); S.push(3); S.push(2); S.push(1);
		 * 
		 * 
		 * S.peek();
		 * 
		 * while (!S.isEmpty()) { S.pop(); }
		 * 
		 * S.peek();
		 */

	}

}
