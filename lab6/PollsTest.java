class PollsTest {
	public static void main(String args[]) {
		PollSet p = new PollSet(3);

		// first poll includes 13 yes and 8 no
		p.getPoll(0).addYes(13);
		p.getPoll(0).addNo(8);

		// second poll includes 4 yes and 6 no
		p.getPoll(1).addYes(4);
		p.getPoll(1).addNo(6);

		// third poll includes 9 yes and 7 no
		p.getPoll(2).addYes(9);
		p.getPoll(2).addNo(7);

		System.out.println(p);

		if (p.getPoll(0).compareWithPoll(p.getPoll(1)))
			System.out.println("First poll has a larger percentage of yes compared to second");
		else
			System.out.println("First poll does not have a larger percentage of yes compared to second");

		if (p.getPoll(1).compareWithPoll(p.getPoll(2)))
			System.out.println("Second poll has a larger percentage of yes compared to third");
		else
			System.out.println("Second poll does not have a larger percentage of yes compared to third");

		System.out.println("Combined poll: " + p.combinePolls());

		PollSet p2 = new PollSet(p);

		p2.setPoll(0, p.combinePolls());
		System.out.println(p);
		System.out.println(p2);
	}
}
