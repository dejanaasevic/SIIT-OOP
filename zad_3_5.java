package vezbe_03;

import java.util.Scanner;

public class zad_3_5 {
	
	static String tekst;
	static String [][] proizvodi;
	static Scanner sc = new Scanner(System.in);
	static boolean exit;
	
	public static void main(String[] args) {
		obrada_podataka();
		exit = false;
		do {
			System.out.println("--- Meni aplikacije ---");
			System.out.println("0. Izlazak iz aplikacije");
			System.out.println("1. Ispis spisaka naziva svih artikala");
			System.out.println("2. Ispis podatka određenog artikla");
			System.out.println("3. Ispis artikla koji su na akciji");
			System.out.println("4. Ispis artikla određenog proizvođača");
			
			System.out.println();
			System.out.print("Unesite odgovarajuću opciju: ");
			int izbor = sc.nextInt();
			sc.nextLine();
			
			switch(izbor) {
				case 0: 
					System.out.println("Usepšno ste izašli iz aplikacije!");
					exit = true;
					break;
				case 1: 
					spisak_Naziva_Svih_Artikla();
					break;
				case 2: 
					ispis_Podatka_Određenog_artikla();
					break;
				case 3: 
					ispis_Artikla_Na_Akciji();
					break;
				case 4: 
				    ispis_Artikla_Određenog_proizvođača();
					break;
				default:
					System.out.println("Uneli ste nevazecu opciju");
					System.out.println();
					break;
			}
		} while(!exit);
		sc.close();
	}

	public static void ispis_Artikla_Određenog_proizvođača() {
		System.out.print("Unesite ime proizvodjaca: ");
		String proizvodjac = sc.nextLine();
		for(int i = 0; i< proizvodi.length; i++) {
			if (proizvodi[i][2].trim().toLowerCase().equals(proizvodjac.trim().toLowerCase())) {
				System.out.println();
				System.out.printf("Naziv: %s \n", proizvodi[i][0]);
				System.out.printf("Sifra: %s \n", proizvodi[i][1]);
				System.out.printf("Proizvodjac: %s \n", proizvodi[i][2]);
				System.out.printf("Cena: %s \n", proizvodi[i][3]);
				if (proizvodi[i][4].trim().equals("akcija")) {
					System.out.printf("Akcija: da");
				}
				else {
					System.out.printf("Akcija: ne");
				}
				System.out.println();
			}
		}
		
		
	}

	public static void ispis_Artikla_Na_Akciji() {
		System.out.println("-- Prikaz artikla na akciji --");
		for(int i = 0; i < proizvodi.length; i++) {
			if (proizvodi[i][4].trim().equals("akcija")){
				System.out.println();
				System.out.printf("Naziv: %s \n", proizvodi[i][0]);
				System.out.printf("Sifra: %s \n", proizvodi[i][1]);
				System.out.printf("Proizvodjac: %s \n", proizvodi[i][2]);
				System.out.printf("Cena: %s \n", proizvodi[i][3]);
				System.out.printf("Akcija: da");
				System.out.println();
			}
		}
		
	}

	public static void ispis_Podatka_Određenog_artikla() {
		spisak_Naziva_Svih_Artikla();
		System.out.println();
		System.out.print("Unesite opciju: ");
		int izbor = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println("-- Prikaz izabranog artikla --");
		System.out.printf("Naziv: %s \n", proizvodi[izbor-1][0]);
		System.out.printf("Sifra: %s \n", proizvodi[izbor-1][1]);
		System.out.printf("Proizvodjac: %s \n", proizvodi[izbor-1][2]);
		System.out.printf("Cena: %s \n", proizvodi[izbor-1][3]);
		if (proizvodi[izbor-1][4].trim().equals("akcija")) {
			System.out.printf("Akcija: da");
		}
		else {
			System.out.printf("Akcija: ne");
		}
		System.out.println();
	}

	public static void spisak_Naziva_Svih_Artikla() {
		System.out.println("- Spisak naziva svih artikala -");
		for (int i = 0; i < proizvodi.length; i++) {
			System.out.printf("%d. %s",i+1, proizvodi[i][0]);
			System.out.println();
		}
	
	}
	
	public static void obrada_podataka() {
		tekst = "Coko plazma|s01|Bambi|85.30|akcija\n"
				+ "Smoki|s02|Stark|55.00|nije na akciji\n"
				+ "Cipsi|s03|Marbo|115.20|nije na akciji\n"
				+ "Krem Bananica|s04|Stark|11.00|akcija\n";
		
		String [] tekst_Niz = tekst.split("\n");
		proizvodi = new String [tekst_Niz.length][];
		for (int i = 0; i < tekst_Niz.length; i++) {
			String [] proizvod = tekst_Niz[i].split("\\|");
			proizvodi[i]= new String [proizvod.length];
			for (int j = 0; j < proizvod.length; j++) {
				proizvodi[i][j]= proizvod[j];
			}
		}
	}

}