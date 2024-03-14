package vezbe_02;

public class zad_2_5_b {

	public static void main(String[] args) {
		int br_dana = 0;
		for(int g = 2000; g <= 2016; g++) {
			for (int m = 1; m <= 12; m++) {
				if (m % 2 == 0) {
					br_dana += 30;
				}
				else {
					br_dana += 31;
				}
			}
		}
		System.out.println("Proslo je ukupno " + br_dana + " dana.");

	}

}
