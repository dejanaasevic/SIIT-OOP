package vezbe_03;

public class zad_3_2 {

	public static void main(String[] args) {
		String pattern = "4,3,2,1;0,1,0;1,2,3,4";
		String [] vrste = pattern.split(";");
		String [][] A = new String [vrste.length][];
		for (int i = 0; i<vrste.length; i++) {
			String [] kolone = vrste[i].split(",");
			A[i] = new String [kolone.length];
			for (int j = 0; j < kolone.length; j++) {
				A[i][j]= kolone[j];
			}
		}
		
		for(int i = 0; i < vrste.length; i++) {
			String [] kolone = vrste[i].split(",");
			for(int j = 0; j < kolone.length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}

}
