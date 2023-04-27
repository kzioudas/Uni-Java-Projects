import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.println("Please enter two integers:");
		a = in.nextInt();
		b = in.nextInt();
		int gcd = findGCD(a, b);
		if (gcd == 0) {
			System.out.println("The gcd is not defined");
		} else {
			System.out.printf("The gcd of %d and %d is %d.", a, b, gcd);
		}
	}

	// method that finds gcd of two numbers
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
