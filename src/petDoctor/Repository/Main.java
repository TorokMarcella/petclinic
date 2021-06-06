package petDoctor.Repository;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int gomb = 0;
		
		Metodusok met = new Metodusok();
		Menu menu = new Menu();

		while (true) {
			System.out.println("---Üdvözöllek a PetClinic alkalmazásban---");
			menu.udvozlo();
			if (in.hasNextInt()) {
				gomb = in.nextInt();
			} else {
				System.out.println("Nem megfelelõ szám! " + in.next());
			}
			if (gomb == 0) {
				menu.udvozlo();
			} else if (gomb == 1) {
				menu.gazdi();
			} else if (gomb == 2) {
				menu.kisallat();
			} else if (gomb == 3) {
				met.kisallatKeres(null);
			} else if (gomb == 4) {
				met.chipAzonosit(0);
			} else if (gomb == 5) {
				met.oltasFelvitele(null, null, null);
			} else if (gomb == 6) {
				met.torles(0, 0);
			} else if (gomb == 7) {
				
			} else {
				menu.alkalmazasVege();
			}
		}
	}
}
