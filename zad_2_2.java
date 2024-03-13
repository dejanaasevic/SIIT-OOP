package vezbe_02;

public class zad_2_2 {

	public static void main(String[] args) {
		int br = 0;
		for(double i = -1; i<=1.5; i+=0.25) {
			if (i % 0.25 ==0) {
				br++;
			}
		}
		System.out.println("U intervalu ima ukupno " + br + " cetvrtina");

	}

}
