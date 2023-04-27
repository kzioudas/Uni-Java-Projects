class Poll {
	private int YesCount;
	private int NoCount;

	public Poll() {
		this.YesCount = 0;
		this.NoCount = 0;
	}

	public Poll(int yes, int no) {
		this.YesCount = yes;
		this.NoCount = no;
	}

	public Poll(Poll p) {
		YesCount = p.YesCount;
		NoCount = p.NoCount;
	}

	public int getYesCount() {
		return YesCount;
	}

	public int getNoCount() {
		return NoCount;
	}

	double getYesPercentage() {
		double YesPercentage = (YesCount / (YesCount + NoCount)) * 100;
		return YesPercentage;
	}

	double getNoPercentage() {
		double NoPercentage = (NoCount / (YesCount + NoCount)) * 100;
		return NoPercentage;
	}

	public void addYes(int Num) {
		this.YesCount = +Num;
	}

	public void addNo(int Num) {
		this.NoCount = +Num;
	}

	boolean compareWithPoll(Poll other) {
		boolean cWPboolean;
		if (this.YesCount > other.YesCount) {
			cWPboolean = true;

		} else {
			cWPboolean = false;

		}

		return cWPboolean;
	}

	public String toString() {
		String s = "Yes:" + this.YesCount + " (" + getYesPercentage() + ") , No: " + this.NoCount + " ("
				+ getNoPercentage() + ")";
		return s;
	}
}
