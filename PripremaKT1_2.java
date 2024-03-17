package pripremaKT1;

import java.util.Scanner;

public class PripremaKT1_2 {

	static boolean exit;
	static int n = 100;
	static int brStudenata = 0;
	static String[][] studenti = new String[n][];
	static int[][] bodovi = new int[n][3];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		exit = false;
		do {
			System.out.println("-- Meni aplikacije --");
			System.out.println("0. Izlaz iz aplikacije");
			System.out.println("1. Dodavanje studenata");
			System.out.println("2. Unos bodova za studenta");
			System.out.println("3. Prikaz bodova i ocena za studenta");
			System.out.println("4. Prikaz statistike kursa");
			System.out.println();
			System.out.print("Unesite opciju: ");
			int izbor = sc.nextInt();
			sc.nextLine();

			switch (izbor) {
			case 0:
				System.out.println("Izlazak iz aplikacije");
				exit = true;
				break;
			case 1:
				dodajStudenta();
				break;
			case 2:
				unosBodovaZaStudenta();
				break;
			case 3:
				prikazBodovaIOcenaZaStudenta();
				break;
			case 4:
				prikazStatistikeKursa();
				break;
			default:
				System.out.println("Unos nije ispravan. Pokusajte ponovo.");
				break;
			}

		} while (!exit);
		sc.close();
	}

	private static void prikazStatistikeKursa() {
		int minBodovi = ukupanBrojBodova(0);
		int maxBodovi = ukupanBrojBodova(0);
		int sum = 0;
		for(int i = 0; i< brStudenata; i++) {
			int brBodova = ukupanBrojBodova(i);
			sum += brBodova;
			if(minBodovi > brBodova) {
				minBodovi = brBodova;
			}
			if(maxBodovi < brBodova) {
				maxBodovi = brBodova;
			}
		}
		
		double prosekBodova = (double)sum/brStudenata;
		double prosekOcena = Ocena((int)prosekBodova);
		int minOcena = Ocena(minBodovi);
		int maxOcena = Ocena(maxBodovi);
		
		System.out.println("Minimalan broj bodova: " + minBodovi);
		System.out.println("Maksimalan broj bodova: " + maxBodovi);
		System.out.println("Prosecan broj bodova: " + prosekBodova);
		System.out.println("Prosecna ocena: " + prosekOcena);
		System.out.println("Minmalna ocena: " + minOcena);
		System.out.println("Maksimalna ocena: " + maxOcena);
		System.out.println();
	}

	private static int ukupanBrojBodova(int indeks) {
		int brBodova = 0;
		for (int i = 0; i < bodovi[indeks].length; i++) {
			brBodova += bodovi[indeks][i];
		}
		return brBodova;
	}

	private static void prikazBodovaIOcenaZaStudenta() {
		System.out.println("-- Prikaz bodova i ocena za studenta --");
		System.out.println();
		System.out.print("Unesite indeks studenta: ");
		String brIndeksaStudenta = sc.nextLine();
		int indeks = -1;
		for(int i = 0; i < brStudenata; i++) {
			if(brIndeksaStudenta.trim().equalsIgnoreCase(studenti[i][2])) {
				indeks = i;
			}
		}
		if(indeks == -1) {
			System.out.println("Ne postoji student sa tim indeksom.");
			return;
		}
		else {
			int brBodova = 0;
			for (int i = 0; i < bodovi[indeks].length; i++) {
				brBodova += bodovi[indeks][i];
			}
			int ocena = Ocena(brBodova);
			System.out.printf("Student %s %s - %s osvojio je %d bodova i ocenu %d", studenti[indeks][0],
					studenti[indeks][1], studenti[indeks][2], brBodova, ocena);
		}
	}

	private static int Ocena(int brBodova) {
		if (brBodova >= 91) {
			return 10;
		}
		else if (brBodova >= 81) {
			return 9;
		}
		else if (brBodova >= 71) {
			return 8;
		}
		else if (brBodova >= 61) {
			return 7;
		}
		else if (brBodova >= 51) {
			return 6;
		}
		else {
			return 5;
		
		}
	}

	private static void unosBodovaZaStudenta() {
		System.out.println("-- Unos bodova za studenta --");
		System.out.println();
		System.out.print("Unesite indeks studenta: ");
		String brIndeksaStudenta = sc.nextLine();
		int indeks = -1;
		for (int i = 0; i < brStudenata; i++) {
			if (brIndeksaStudenta.trim().equalsIgnoreCase(studenti[i][2])) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Ne postoji student sa tim indeksom.");
			return;
		} else {
			System.out.println("Unesi broj bodova: ");
			System.out.println("Unesite bodove studenta u formatu [bodovi1 bodovi2 bodovi3]: ");
			String brojBodova = sc.nextLine().trim();
			String[] nizBrojBodova = brojBodova.split(" ");

			bodovi[indeks][0] = Integer.parseInt(nizBrojBodova[0]);
			bodovi[indeks][1] = Integer.parseInt(nizBrojBodova[1]);
			bodovi[indeks][2] = Integer.parseInt(nizBrojBodova[2]);

		}
	}

	private static void dodajStudenta() {
		System.out.println("-- Dodavanje studenta --");
		System.out.println();
		System.out.println("Unesite podatke o studentu u formatu [ime;prezime;brojIndeksa]: ");
		String noviStudent = sc.nextLine().trim();
		String[] nizNoviStudent = noviStudent.split(";");
		studenti[brStudenata] = new String[nizNoviStudent.length];
		studenti[brStudenata][0] = nizNoviStudent[0];
		studenti[brStudenata][1] = nizNoviStudent[1];
		studenti[brStudenata][2] = nizNoviStudent[2];
		System.out.printf("Uspešno dodat student %s %s sa brojem indeksa %s.", studenti[brStudenata][0],
				studenti[brStudenata][1], studenti[brStudenata][2]);
		brStudenata++;
		System.out.println();
	}
}
