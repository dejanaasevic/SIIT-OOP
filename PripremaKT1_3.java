package pripremaKT1;

import java.util.Scanner;

public class PripremaKT1_3 {

	static boolean exit;
	static Scanner sc = new Scanner(System.in);
	static int n = 50;
	static int brPredmeta = 0;
	static String [][] predmeti = new String [n][3];
	static int [] studenti = new int [n];
	
	
	public static void main(String[] args) {
	 do {
		System.out.println("-- Meni aplikacije");
		System.out.println("0. Izlazak iz aplikacije");
		System.out.println("1. Dodavanje predmeta");	
		System.out.println("2. Dodavanje broja studenata na predmet");
		System.out.println("3. Prikaz broja studenata na predmetu");
		System.out.println("4. Prikaz prosečnog broja studenata po predmetu");
		System.out.println();

		System.out.print("Unesite opciju: ");
		int izbor = sc.nextInt();
		sc.nextLine();
		switch(izbor) {
			case 0:
				exit = true;
				System.out.println("Izlazak iz aplikacije");
				break;
			case 1:
				dodavanjePredmeta();
				break;
			case 2:
				dodavanjeBrojaStudenataNaPredmet();
				break;
			case 3:
				prikazBrojaStudenataNaPredmetu();
				break;
			case 4:
				prikazProsečnogBrojaStudenataPoPredmetu();
				break;
			default:
				System.out.println("Neodgovarajuca opcija, molimo pokusajte ponovo!");
				break;
		}
	 }while(!exit);
	}

	private static void prikazProsečnogBrojaStudenataPoPredmetu() {
		int sum = 0;
		for (int i = 0; i < brPredmeta; i++) {
			sum += studenti[i];
		}
		double prosek = (double)sum/brPredmeta;
		System.out.printf("Prosecan broj studenata po predmetima je: %.2f", prosek);
		System.out.println();
		
	}

	private static void prikazBrojaStudenataNaPredmetu() {
		System.out.println("-- Prikaz broja studenata na predmetu --");
		System.out.print("Unesite sifru predmeta: ");
		System.out.println();
		String sifra = sc.nextLine();
		int indeks = -1;
		for (int i = 0; i < brPredmeta; i++) {
			if (predmeti[i][0].equals(sifra)) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Predmet sa datom sifrom ne postoji. Pokusajte ponovo.");
			return;
		}
		else {
			System.out.printf("Na predmetu %s - %s ucestvuje %d studenata. ",
					predmeti[indeks][0], predmeti[indeks][1], studenti[indeks]);
			System.out.println();
		}
	}

	private static void dodavanjeBrojaStudenataNaPredmet() {
		System.out.println("-- Dodavanje broja studenata na predmet --");
		System.out.print("Unesite sifru predmeta: ");
		System.out.println();
		String sifra = sc.nextLine();
		int indeks = -1;
		for (int i = 0; i < brPredmeta; i++) {
			if (predmeti[i][0].equals(sifra)) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Predmet sa datom sifrom ne postoji. Pokusajte ponovo.");
			return;
		}
		else {
			System.out.print("Unesite broj studenata upisanih na predmetu: ");
			int br = sc.nextInt();
			sc.nextLine();
			studenti[indeks] = br;	
		}	
	}

	private static void dodavanjePredmeta() {
		System.out.println("-- Dodavanje predmeta --");
		System.out.println("Unesite podatke o predmetu u formatu [šifra;naziv;ESPB]: ");
		String noviPredmet = sc.nextLine();
		String [] nizNoviPredmet = noviPredmet.split(";");
		predmeti[brPredmeta][0] = nizNoviPredmet[0];
		predmeti[brPredmeta][1] = nizNoviPredmet[1];
		predmeti[brPredmeta][2] = nizNoviPredmet[2];
		System.out.printf("Uspešno dodat predmet %s - %s (%s ESPB)", predmeti[brPredmeta][0],
				predmeti[brPredmeta][1], predmeti[brPredmeta][2]);
		brPredmeta++;
	}	
}