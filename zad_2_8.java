package vezbe_02;
public class zad_2_8 {

	public static void main(String[] args) {
		int n = 10;
		int[][] matrica = new int[n][];
		for (int i = 0; i < matrica.length; i++) {
			matrica[i] = new int[i + 3];
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = 2 * (i + j);
			}
		}
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
