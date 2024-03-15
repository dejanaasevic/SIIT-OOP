package vezbe_02;
import java.util.Random;

public class zad_2_11 {

	public static void main(String[] args) {
		int n = 10;
		Random random  = new Random();
		int [] a = new int [n];
		int [] b = new int [n];
		for (int i = 0; i<n; i++) {
			a[i] = random.nextInt(100);
			b[i] = random.nextInt(100);
		}
		int [] c = new int [n];
		int j = n - 1;
		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				c[i] =  a[i] + b[j];
			}
			else {
				c[i] =  a[i] * b[j];
			}
			j --;
		}
		ispisi(a);
		ispisi(b);
		ispisi(c);
		
	}
	
	public static void ispisi(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
}
