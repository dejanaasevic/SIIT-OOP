package vezbe_02;

public class zad_2_3 {

	public static void main(String[] args) {
		int n = 20;
		int [] niz = new int [n];
		int val = 1;
		for(int i = 0; i<n; i++) {
			niz[i] = val;
			System.out.print(niz[i] + " ");
			val += 10;
		}
	}
}
