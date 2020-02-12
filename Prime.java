import java.util.*;

public class Prime {

	public static void Primes(int n) {

		boolean isPrime = true;

		for (int i = 2; i <= n; i++) {
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = scan.nextInt();
		System.out.println("Following are the Primes:");
		Primes(n);

	}
}
