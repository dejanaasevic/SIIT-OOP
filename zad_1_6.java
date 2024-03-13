package vezbe_01;

public class zad_1_6 {

	public static void main(String[] args) {
		int precnik_Kupe = 6;
		int visina_Kupe = 4;
		int poluprecnik_Kupe = precnik_Kupe / 2;
		double s = Math.sqrt(Math.pow(poluprecnik_Kupe, 2) + Math.pow(visina_Kupe, 2));
		double povrsina_Kupe = poluprecnik_Kupe * Math.PI *(s + poluprecnik_Kupe);
		System.out.println("Povrsina kupe: " + povrsina_Kupe);
	}

}
