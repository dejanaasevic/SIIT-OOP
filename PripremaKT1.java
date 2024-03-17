package pripremaKT1;

import java.util.Scanner;

public class PripremaKT1 {
	static Scanner sc = new Scanner(System.in); 
	static boolean exit;
	static int n = 50;
	static String [][] artikli = new String [n][2];
	static int [][] kolicina = new int [n][3];
	static int brojArtikla = 0;
	
	public static void main(String[] args) {
		exit = false;
		do {
			System.out.println("-- Meni aplikacije --");
			System.out.println("0. Izlaz iz aplikacije");
			System.out.println("1. Dodavanje artikla");
			System.out.println("2. Dodavanje kolicine u magacinu");
			System.out.println("3. Prikaz kolicina iz magacina");
			System.out.println("4. Prikaz prosecne kolicine artikla iz magacina");
			System.out.println();
			
			System.out.print("Unesite opciju: ");
			int opcija = sc.nextInt();
			sc.nextLine();
			
			switch(opcija){
			case 0:
				exit = true;
				System.out.println("Izlazak iz aplikacije!");
				break;
			case 1:
				dodavanje_Artikla();
				break;
			case 2:
				dodavanje_Količine_U_Magacinu();
				break;
			case 3:
				prikaz_Kolicina_Iz_Magacina();
				break;
			case 4:
				 prikaz_Prosecne_Kolicine_Artikla_Iz_Magacina();
				break;
			default:
				System.out.println("Nije uneta validna opcija.");
				System.out.println();
				break;
				
			}
		}while(!exit);
		sc.close();
	}

	private static void prikaz_Prosecne_Kolicine_Artikla_Iz_Magacina() {
		System.out.println("-- Prikaz prosecne kolicine artikla iz magacina --");
		for(int i =0; i<brojArtikla; i++) {
			String sifraArtikla = artikli[i][0];
			String imeArtikla = artikli[i][1];
			int sum = 0;
			for (int j = 0; j<kolicina[i].length; j++) {
				sum += kolicina[i][j];
			}
			double prosek = (double)sum / 3;
			
			System.out.printf("%s   %s  %.2f",sifraArtikla, imeArtikla, prosek);
			System.out.println();
		}	
	}

	public static void prikaz_Kolicina_Iz_Magacina() {
		System.out.println("-- Prikaz kolicina iz magacina --");
		System.out.print("Unesite sifru artikla: ");
		String sifra = sc.nextLine();
		int indeks = -1;
		for (int i = 0; i < brojArtikla; i++) {
			if(artikli[i][0].trim().equals(sifra.trim())) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Artikal sa datom sifrom ne postoji!");
			return;
		}
		else {
			System.out.printf("Artikal %s %s se u magacinima nalazi"
					+ " u količinama %d, %d i %d", artikli[indeks][0], artikli[indeks][1],
					kolicina[indeks][0],kolicina[indeks][1],kolicina[indeks][2]);
			System.out.println();
		}
	}

	public static void dodavanje_Količine_U_Magacinu() {
		System.out.println("-- Dodavanje količine u magacinu --");
		System.out.print("Unesite sifru artikla: ");
		String sifra = sc.nextLine();
		int indeks = -1;
		for (int i = 0; i < brojArtikla; i++) {
			if(artikli[i][0].trim().equals(sifra.trim())) {
				indeks = i;
			}
		}
		if (indeks == -1) {
			System.out.println("Artikal sa datom sifrom ne postoji!");
			return;
		}
		else {
			System.out.println("Unesi količine artikla u magacinima u formatu [količina1 količina2 količina3]");
			String novaKolicina = sc.nextLine();
			novaKolicina = novaKolicina.substring(1,novaKolicina.length()-1).trim();
			String [] nizKolicina = novaKolicina.split(" ");
			kolicina[indeks][0] = Integer.parseInt(nizKolicina[0]);
			kolicina[indeks][1] = Integer.parseInt(nizKolicina[1]);
			kolicina[indeks][2] = Integer.parseInt(nizKolicina[2]);
		}
		
	}

	public static void dodavanje_Artikla() {
		System.out.println("-- Dodavanje Artikla");
		System.out.println("Unesi podatke o artiklu u formatu [šifra;naziv]: ");
		String noviArtikal = sc.nextLine();
		noviArtikal = noviArtikal.trim().substring(1, noviArtikal.length()-1);
		String [] noviArtikalNiz = noviArtikal.split(";");
		artikli[brojArtikla][0] = noviArtikalNiz[0];
		artikli[brojArtikla][1] = noviArtikalNiz[1];
		brojArtikla++;
		System.out.printf("Uspesno dodat artikal %s %s",noviArtikalNiz[0], noviArtikalNiz[1]);
		System.out.println();
	}
}
