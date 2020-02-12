import java.util.*;

public class Factorial {

	public static double factorial(double n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return (n * factorial(n - 1));

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		double n = scan.nextDouble();

		System.out.println(n + "! = " + factorial(n));

	}

}
