package vezbe_02;
import java.util.Random;

public class zad_2_14 {

	public static void main(String[] args) {
		Random random = new Random();
		int n = 10;
		int [] x = new int [n];
		int [] y = new int [n];
		for (int i = 0; i < n; i++) {
			x[i] = random.nextInt(100);
			y[i] = random.nextInt(100);
		}
		int prva_tacka = -1;
		int druga_tacka = -1;
		double d_min = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(x[0] - y[1], 2));;
		for (int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				double new_d  = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
				if (new_d < d_min) {
					d_min = new_d;
					prva_tacka = i;
					druga_tacka = j;
				}
			}
		}
		System.out.println("X KOORDINATE");
		ispis(x);
		System.out.println("Y KOORDINATE");
		ispis(y);
		
		System.out.printf("d_min = %.2f    A(%d , %d)  B(%d , %d)", d_min, x[prva_tacka], y[prva_tacka], x[druga_tacka], y[druga_tacka]);
	}
	
	public static void ispis(int [] a) {
		for(int i = 0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
