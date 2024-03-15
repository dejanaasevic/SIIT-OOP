package vezbe_02;

public class zad_2_10 {

	public static void main(String[] args) {
		int n  = 3;
		int val = 1;
		int [][] A = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = val;
				val ++;
			}
		}
		System.out.println("STARA MATRICA");
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("NOVA MATRICA");
		int i = 0;
		for(int j = n-1; j >= 0; j--) {
			int prom = A[i][j];
			A[i][j] = A[i][i];
			A[i][i] = prom;
			i++;
		}
		
		for(i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}


	}

}
