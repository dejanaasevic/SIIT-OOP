package vezbe_02;

public class zad_2_6 {

	public static void main(String[] args) {
		int [] A = {-10, 3, 16, 1, 4, -2};
		int min = A[0];
		int max = A[0];
		int sum = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (max < A[i]) { max = A[i];}
			if (min > A[i]) { min = A[i];}
			sum += A[i];
		}
		double srednja_Vrednost = sum / A.length;
		
		System.out.println("Maksimalni element = " + max);
		System.out.println("Minimalni element = " + min);
		System.out.println("Srednja vrednost = " + srednja_Vrednost);

		System.out.println();
		System.out.println("To su elementi:");
		for(int i = 0; i<A.length; i++) {
			if (A[i] > 0 && A[i]< srednja_Vrednost) {
				System.out.print(A[i] + " ");
			}
		}
	}

}
