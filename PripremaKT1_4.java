package pripremaKT1;

import java.util.Scanner;

public class PripremaKT1_4 {
	static int n = 50;
	static String [][] knjige = new String [n][3];
	static int [] primerci = new int [n];
	static int brKnjiga = 0;
	static boolean exit = false;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.println("-- meni aplikacije --");
			System.out.println("0. Izlazak iz aplikacije");
			System.out.println("1. Dodavanje knjiga u biblioteku");
			System.out.println("2. Pozajmljivanje knjiga");
			System.out.println("3. Vraćanje knjiga");
			System.out.println("4. Pregled dostupnih knjiga");
			System.out.println();
			System.out.println("Unesite opciju:");
			int izbor = sc.nextInt();
			sc.nextLine();
			switch(izbor) {
				case 0:
					exit = true;
					System.out.println("Izlazak iz aplikacije");
					break;
				case 1:
					dodavanjeKnjigeUBiblioteku();
					break;
				case 2:
					prozajmljivnjeKnjiga();
					break;
				case 3:
					vracanjeKnjiga();
					break;
				case 4:
					pregledDostupnihKnjiga();
					break;
				default:
					System.out.println("Pogresna opcija. Pokusajte ponovo.");
					break;
			}
		
		}while(!exit);
		
		
	}
	
	
	private static void pregledDostupnihKnjiga() {
		System.out.println("-- Pregled dostupnih knjiga --");
		for(int i = 0; i< brKnjiga; i++) {
			if(primerci[i]>0) {
				System.out.printf("%s - %s (%s , %d primeraka)\n",
						knjige[i][0],knjige[i][1],knjige[i][2],primerci[i] );
				System.out.println();
			}
		}
	}
	
	private static void vracanjeKnjiga() {
		System.out.println("-- Vraćanje knjiga --");
		System.out.print("Unesite ime knjige: ");
		String imeKnjige = sc.nextLine();
		int indeks = -1;
		for(int i = 0; i < brKnjiga; i++) {
			if (knjige[i][0].equalsIgnoreCase(imeKnjige)) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Knjiga sa takvim imenom nije pronadjena.");
			return;
		}
		else {
			primerci[indeks] ++;
			System.out.printf("Vratili ste knjigu: %s - %s (%s)",
					knjige[indeks][0], knjige[indeks][1], knjige[indeks][2]);
		}
}
	
	private static void prozajmljivnjeKnjiga() {
		System.out.println("-- Pozajmljivanje knjiga --");
		System.out.print("Unesite ime knjige: ");
		String imeKnjige = sc.nextLine();
		int indeks = -1;
		for(int i = 0; i < brKnjiga; i++) {
			if (knjige[i][0].equalsIgnoreCase(imeKnjige)) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Knjiga sa takvim imenom nije pronadjena.");
			return;
		}
		else if(primerci[indeks] == 0) {
			System.out.println("Svi primerci su vec izdati.");
			return;
		}
		else {
			primerci[indeks] --;
			System.out.printf("Pozajmili ste knjigu: %s - %s (%s)\n",
					knjige[indeks][0], knjige[indeks][1], knjige[indeks][2]);
		}
	}
	
	private static void dodavanjeKnjigeUBiblioteku() {
		System.out.println("-- Dodavanje knjiga u biblioteku --");
		System.out.print("Unesite podatke o knjizi u formatu [naslov;autor;žanr;broj_primeraka]");
		String novaKnjiga = sc.nextLine();
		String [] nizNovaKnjiga = novaKnjiga.split(";");
		knjige[brKnjiga][0] = nizNovaKnjiga[0];
		knjige[brKnjiga][1] = nizNovaKnjiga[1];
		knjige[brKnjiga][2] = nizNovaKnjiga[2];
		primerci[brKnjiga] = Integer.parseInt(nizNovaKnjiga[3]);
		System.out.printf("Uneta je nova knjiga: %s - %s (%s , %s primeraka)\n",
				knjige[brKnjiga][0],knjige[brKnjiga][1],knjige[brKnjiga][2],primerci[brKnjiga] );
		brKnjiga++;
	}
}