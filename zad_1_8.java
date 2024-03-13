package vezbe_01;

public class zad_1_8 {

	public static void main(String[] args) {
		double a = 1;
		double b = 5;
		double c = 6;
		
		double d = b*b - 4*a*c;
		if (d>0) {
			System.out.println("Postoji dva realna resenja.");
			resi_kvadratnu_jednacinu(a,b,c);
		}
		else if (d == 0) {
			System.out.println("Postoji jedno realno resenje.");
			resi_kvadratnu_jednacinu(a,b,c);
		}
		else {
			System.out.println("Resenja su kompleksna.");
		}

	}
	
	public static void resi_kvadratnu_jednacinu(double a, double b, double c) {
		double d = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(d))/(2*a);
		double x2 = (-b - Math.sqrt(d))/(2*a);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}

}
