package vezbe_01;

public class zad_1_2 {

	public static void main(String[] args) {
		double povrsina_Kvadrata = 16;
		double osnovica_Trougla = 4;
		double krak_Trougla = 6;
		double a = Math.sqrt(povrsina_Kvadrata);
		double h = Math.sqrt(Math.pow(krak_Trougla, 2)- Math.pow(osnovica_Trougla, 2)/4);
		double povrsina_Trougla = (osnovica_Trougla * h)/2;
		
		System.out.println("Duzina stranice kvadrata je: " + a);
		System.out.println("Povrsina trougla je: " + povrsina_Trougla);

	}

}
