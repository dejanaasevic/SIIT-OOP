package vezbe_02;

public class zad_2_7 {

	public static void main(String[] args) {
		int n = 4;
		int m = 3;
		int val = 0;
		int [][] A = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = val;
				val++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}
}
