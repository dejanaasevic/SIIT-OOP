package vezbe_02;
public class zad_2_15 {

	public static void main(String[] args) {
		int n = 8;
		int m = 1;
		String crta = "-";
		String zvezda = "*";
		
		for(int i = n; i >= 0; i--) {
			ispisi(crta,i);
			ispisi(zvezda,m);
			ispisi(crta,i);
			System.out.println();
			m+=2;		
		}
		m-=2;
		for(int i = 0; i <= n; i++) {
			ispisi(crta,i);
			ispisi(zvezda,m);
			ispisi(crta,i);
			System.out.println();
			m-=2;		
		}
	}
	public static void ispisi (String pattern, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(pattern);
		}
	}
}
	