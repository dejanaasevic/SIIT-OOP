package vezbe_01;

public class zad_1_7 {

	public static void main(String[] args) {
		double x = 30;
		double y = 20;
		double max = Math.max(x, y);
		double min = Math.min(x, y);
		double z;
		if (x<y) {
			z = max/(1+Math.abs(min));
		}
		else {
			z = max/(1+min);		
		}
		System.out.println(z);

	}

}
