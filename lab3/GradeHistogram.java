import java.util.Scanner;

class GradeHistogram {
	private int histogram[] = { 0, 0, 0, 0, 0 };

	public GradeHistogram(char[] h1) {
		for (int i = 0; i < h1.length; i++) {
			if (h1[i] == 'A') {
				histogram[0] += 1;
			} else if (h1[i] == 'B') {
				histogram[1] += 1;
			} else if (h1[i] == 'C') {
				historgam[2] += 1;
			} else if (h1[i] == 'D') {
				histogram[3] += 1;
			} else if (h1[i] == 'F') {
				histogram[4] += 1;
			}
		}
	}

	public String toString() {
		String grades = "A:" + histogram[0] + " B:" + histogram[1] + " C:" + histogram[2] + " D:" + histogram[3] + " F:"
				+ histogram[4];
		return grades;
	}

	public boolean equals(GradeHistogram other) {
		for (int k = 0; k < 5; k++) {
			if (this.histogram[k] != other.histogram[k]) {
				return False;
			}
		}
		return true;
	}

	public void addHistogram(GradeHistogram histogram1) {
		for (int j = 0; j < 5; j++) {
			histogram[j] += histogram1[j];
		}
	}

	class GradeHistogramTest {
		public static void main(String args[]){

	
		System.out.println("Type a sequence of grades separated by commas and hit <Enter>");
		Scanner input = new Scanner(System.in);
		String h1 = input.nextLine();
		h1.split(",");
		GradeHistogram ppq = new GradeHistogram();
		ppq.GradeHistogram(char[] h1);
		GradeHistogram pqq = new GradeHistogram();
		pqq.toString();
		System.out.println("h1 = "+ pqq);
	}
	}
}
