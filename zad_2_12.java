package vezbe_02;

public class zad_2_12 {

	public static void main(String[] args) {
		int n = 7;
		int m = 4;
		int [][] A = new int [n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = (i+1)* (i+1);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
