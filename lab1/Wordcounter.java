import java.util.Scanner;
import java.util.HashMap;

class Wordcounter {
	public static void main(String args[]) {
		System.out.println("Please input some text and press <Enter>");
		Scanner input = new Scanner(System.in);
		String L = input.nextLine();
		System.out.println("Please now input a word!");
		String W = input.next();
		int x = L.indexOf(W);
		int counter = 0;
		while (x != -1) {
			L = L.substring(x, x + 1);
			counter = counter + 1;
			x = L.indexOf(W);
		}
		System.out.println("Word " + W + "appears " + counter + "times");
	}
}
