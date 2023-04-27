class AirplaneSeats {
	private int numrows;
	private boolean seirathesi[][];

	public AirplaneSeats(int numrows) {
		this.numrows = numrows;
		seirathesi = new boolean[numrows][4];
		for (int i = 0; i < numrows; i++) {
			for (int j = 0; j < 4; j++) {
				seirathesi[i][j] = true;
			}
		}
	}

	private int letterToColumn(char col) {
		if (col == 'A') {
			return 0;
		} else if (col == 'B') {
			return 1;
		} else if (col == 'C') {
			return 2;
		} else if (col == 'D') {
			return 3;
		}
		return -1;
	}

	private char columnToLetter(int col) {
		if (col == 0) {
			return 'A';
		} else if (col == 1) {
			return 'B';
		} else if (col == 2) {
			return 'C';
		} else if (col == 3) {
			return 'D';
		}
		return 'Q';

	}

	public boolean isFree(int row, int col) {
		if (seirathesi[row][col] == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFree(int row, char col) {
		int x = letterToColumn(col);
		if (seirathesi[row][x] == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean book(int row, char col) {
		if (seirathesi[row][col] == false) {
			return false;
		} else {
			seirathesi[row][col] = false;
			return true;
		}
	}
}
