public class DRIVER {

	public static void main(String[] args) {
		String infix = "A+B*(C-D)";

		System.out.println("GIVEN INFIX: "+infix);
		
		char[] INFIX = infix.toCharArray();

		int countBrace = 0;
		for (int i = 0; i < INFIX.length; i++) {
			if (INFIX[i] == '(' || INFIX[i] == ')') {
				countBrace++;
			}
		}

		int countNotOperand = 0;
		for (int i = 0; i < INFIX.length; i++) {
			if (INFIX[i] == '(' || INFIX[i] == ')' || INFIX[i] == '+'
					|| INFIX[i] == '-' || INFIX[i] == '*' || INFIX[i] == '/') {
				countNotOperand++;
			}
		}

		char[] POSTFIX = new char[INFIX.length - countBrace];

		Stack s = new Stack(countNotOperand);

		int countPostFixArr = 0;
		
		for (int i = 0; i < INFIX.length; i++) {
			if (INFIX[i] == '(' || INFIX[i] == ')' || INFIX[i] == '+' || INFIX[i] == '-' || INFIX[i] == '*' || INFIX[i] == '/') {
				s.push(INFIX[i]);
			} else {
				POSTFIX[countPostFixArr++] = INFIX[i];
			}
		}

		
		char op;
		
		/*while(!(s.isEmpty())){
			op=s.pop();
			if(op=='('){
				op=s.pop();
				POSTFIX[countPostFixArr++] = op;
			}else if(op!=')' && op!='('){
				POSTFIX[countPostFixArr++] = op;
			}
		}*/
		
		
		while (!(s.isEmpty())) {
			op=s.pop();
			if(op!=')' && op!='('){
				POSTFIX[countPostFixArr++] = op;
			}
		}
		
		System.out.print("PostFix Expression: ");
		for(int i=0;i<POSTFIX.length;i++){
			System.out.print(POSTFIX[i]);
		}
		System.out.println();

	}
}
