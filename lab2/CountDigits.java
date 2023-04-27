import java.util.Scanner;

class DigitsCounter {
	public int counts[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public void advance(int digit) {
		counts[digit] = counts[digit] + 1;
	}

	public void printCounts() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ":" + counts[i] + " ");
		}
		System.out.println();
	}

	public void printTotalCounts() {
		int total = 0;
		for (int s = 0; s < 10; s++) {
			total = total + counts[s];
		}
		System.out.println("Total number of digits counted = " + total);
	}
}

class CountDigits {
	public static void main(String args[]) {
		System.out.println("Type a sequence of digits and hit <Enter>");
		Scanner input = new Scanner(System.in);
		String Arithmoi = input.nextLine();
		int Megethos = Arithmoi.length();
		DigitsCounter ppp = new DigitsCounter();
		for (int j = 0; j < Megethos; j++) {
			int thesi = Arithmoi.charAt(j);

			ppp.advance(thesi);
		}

		ppp.printCounts();

		ppp.printTotalCounts();
	}
}
