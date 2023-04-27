import java.util.*;

class Primes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the minimum number for the range: ");
		int min = input.nextInt();
		System.out.print("Enter the maximum number for the range: ");
		int max = input.nextInt();

		ArrayList<Integer> primesList = new ArrayList<Integer>();
		for (int i = min; i <= max; i++) {
			primesList.add(i);
		}

		for (int i = 0; i < primesList.size(); i++) {
			Iterator<Integer> iter = primesList.iterator();
			int currNum = primesList.get(i);
			while (iter.hasNext()) {
				int num = iter.next();
				if (num % currNum == 0 && num != currNum) {
					iter.remove();
				}
			}
		}

		Iterator<Integer> iter = primesList.iterator();
		System.out.println("The prime numbers from " + min + " to " + max + " are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
	}
}
