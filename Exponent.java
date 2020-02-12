import java.util.*;

public class Exponent {

	// recursively does exponentiation
	public static double exp(double a, double b) {
		if (b == 0) {
			return 1.0;
		} else if (b == 1) {
			return a;
		} else {
			return (a * exp(a, b - 1));
		}
	}

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("To calculate a^b");

		System.out.println("Enter the value of a: ");
		double a =scan.nextDouble();


		System.out.println("Enter the value of b: ");
		double b =scan.nextDouble();

		if (b > 0) {
			System.out.println(exp(a, b));
		} else if (b < 0) {
			double x = 1 / exp(a, -b);
			System.out.println(x);
		}

	}

}
