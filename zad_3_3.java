package vezbe_03;

import java.util.Random;

public class zad_3_3 {

	public static void main(String[] args) {
		int n = 25;
		double [] a = new double [n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = (double)random.nextInt(100);
		}
		
		System.out.println("Niz: ");
		ispisi_Niz(a);
		System.out.println("Najveci element niza je: " + najvećiEl(a));
		System.out.println("Najmanji element niza je: " + najmanjiEl(a));
		System.out.println("Srednja vrednost niza je: " + srednjaVrednost(a));
		System.out.println("Novi niz: ");
		promeniSve(a);
		ispisi_Niz(a);	
	}

	private static void ispisi_Niz(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void promeniSve(double[] a) {
		double srednja_vrednost = srednjaVrednost(a);
		for(int i = 0; i< a.length; i++) {
			if (a[i] > 0) {
				a[i]-=srednja_vrednost;
			}
			if(a[i] < 0) {
				a[i]+=srednja_vrednost;
			}
		}
	}

	private static double srednjaVrednost(double[] a) {
		double sum = 0.0;
		for (int i = 0; i< a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}

	private static double najmanjiEl(double[] a) {
		double min = a[0];
		for (int i = 1; i< a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	private static double najvećiEl(double[] a) {
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}