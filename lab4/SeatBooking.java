import java.util.Scanner;

class SeatBooking {
	public static void main(String args[]) {
		AirplaneSeats airplane = new AirplaneSeats(7); // test airplane has 7 rows
		System.out.println("Seats currently booked are marked with X");
		System.out.println(airplane); // print current status

		Scanner inp = new Scanner(System.in);
		System.out.println("Input the next seat to book, or Q for termination");
		String req = inp.next();
		while (!req.equals("Q")) // while the user does not want to terminate
		{
			int row = Integer.parseInt(req.substring(0, req.length() - 1)); // all characters except last one
			char col = req.charAt(req.length() - 1); // last character
			if (airplane.book(row - 1, col)) { // try to book. row decreased by one because array starts at 0
				System.out.println("Seat booking was successful");
			} else {
				System.out.println("Sorry! Requested seat is occupied, or does not exist");
			}

			System.out.println("Input the next seat to book, or Q for termination");
			req = inp.next();
		}
		System.out.println("Seats currently booked are marked with X");
		System.out.println(airplane); // print current status
	}
}
