package projects;

import java.util.Scanner;

public class Zad_3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String unos = sc.nextLine();
		for(int i = unos.length()-1; i>=0; i--) {
			System.out.print(unos.charAt(i));
		}
		sc.close();
		

	}

}
