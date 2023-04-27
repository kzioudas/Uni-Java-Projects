class PollSet {
	private Poll[] PollArray;
	private int PollArrayCount;

	public PollSet(int NumPolls) {
		this.PollArrayCount = NumPolls;
		this.PollArray = new Poll[NumPolls];
		for (int i = 0; i < NumPolls; i++) {
			PollArray[i] = new Poll();
		}
	}

	public PollSet(PollSet p) {
		PollArray = p.PollArray;
		PollArrayCount = p.PollArrayCount;
	}

	public Poll getPoll(int i) {
		Poll p = PollArray[i];
		return p;
	}

	public void setPoll(int i, Poll p) {
		PollArray[i] = p;
	}

	public Poll combinePolls() {
		int TotalYes = 0;
		int TotalNo = 0;
		for (int i = 0; i < PollArrayCount; i++) {
			TotalYes = +PollArray[i].getYesCount();
			TotalNo = +PollArray[i].getNoCount();
		}
		Poll NewPoll = new Poll(TotalYes, TotalNo);
		return NewPoll;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < PollArrayCount; i++) {
			s = "Poll " + i + 1 + PollArray[i].toString() + "\n";
		}
		return s;
	}
}
