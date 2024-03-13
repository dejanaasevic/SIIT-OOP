package vezbe_01;

public class zad_1_3 {

	public static void main(String[] args) {
		int godina = 1900;
		if (godina < 1538 && godina > 10000) {
			System.out.println("Godina nije validna.");	
		}
		else if (godina % 400 == 0) {
			System.out.println("Godina je prestupna.");
		}
		else if(godina % 100 == 0) {
			System.out.println("Godina nije prestupna.");
		}
		else if (godina % 4 == 0) {
			System.out.println("Godina je prestupna.");
		}
		else {
			System.out.println("Godina nije prestupna.");
		}
	}

}
