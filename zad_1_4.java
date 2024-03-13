package vezbe_01;

public class zad_1_4 {

	public static void main(String[] args) {
		double duzina_cm = 324;
		int duzina_m = 324 / 100;
		double duzina_dm = (duzina_cm - duzina_m * 100)/10;
		System.out.println("Duzina: " + duzina_m + "m " + duzina_dm + "dm");
	}

}
