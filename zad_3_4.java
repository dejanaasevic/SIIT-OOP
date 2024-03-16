package vezbe_03;

import java.util.Random;

public class zad_3_4 {

	public static void main(String[] args) {
		Random random = new Random();
		int n = 10;
		int [] a = new int [n];
		int [] b = new int [n];
		
		for(int i = 0; i < n; i++) {
			a[i] = random.nextInt(100);
			b[i] = random.nextInt(100);
		}
		System.out.println("NIZ A:");
		ispisiNiz(a);
		System.out.println("NIZ B:");
		ispisiNiz(b);
		
		int [] c = napraviNoviNiz(a,b);
		System.out.println("NIZ C:");
		ispisiNiz(c);
	}

	private static int[] napraviNoviNiz(int[] a, int[] b) {
		int [] c = new int [a.length];
		for(int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	private static void ispisiNiz(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
