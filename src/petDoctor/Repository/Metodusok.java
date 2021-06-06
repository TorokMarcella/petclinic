package petDoctor.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import elsoBlokkzaro.entity.Gazda;
import elsoBlokkzaro.entity.Kisallat;
import elsoBlokkzaro.entity.Oltas;

public class Metodusok {
	
	Scanner sc = new Scanner(System.in);
	private List<Gazda> gazda = new ArrayList<>();
	private List<Kisallat> kisallat = new ArrayList<>();
	private List<Oltas> oltas = new ArrayList<>();
	
	//	1. GOMB - GAZDI FELVITELE (Menu osztályból)
	public void gazdaFelvitele(Gazda gaz) {
		gazda.add(gaz);	
	}
	
	//	2. GOMB - KISÁLLAT FELVITELE (Menu osztályból)
	public void kisallatFelvitele(Kisallat allat) {
		kisallat.add(allat);
		
	}
	//	3. GOMB - KISÁLLAT KERESÉSE
	public List<Kisallat> kisallatKeres(Integer azonosito){
		System.out.println("--KISÁLLAT KERESÉSE--");
		System.out.println("Add meg a gazda azonosítóját!");
		sc.nextInt();
		for (Gazda gaz : gazda) {
			if(gaz.getAzonosito().equals(azonosito)) {
				return gaz.getKisallat();
			}	
		}
		return new ArrayList<>();
	}
	
	//	4. GOMB - TALÁLT KISÁLLAT BEAZONOSÍTÁSA
	public List<Kisallat> chipAzonosit(int chipSzam) {
		System.out.println("--KISÁLLAT BEAZONOSÍTÁSA--");
		System.out.println("Add meg a kisállat chipszámát!");
		sc.nextInt();
		List<Kisallat> chip = new ArrayList<>();
		for (Kisallat kisallat : chip) {
			if(kisallat.getChipSzam() == chipSzam) {
				chip.add(kisallat);
			}
		}
		return new ArrayList<>();
	}

	//	5. GOMB - OLTÁS FELVITELE
	public List<Oltas> oltasFelvitele(Date datum, Date ervenyesseg, String mireKapta) {
		System.out.println("--OLTÁS FELVITELE--");
		oltas.add(new Oltas(datum, ervenyesseg, mireKapta));
		
	//	return new ArrayList<>();
		
		return oltas;
	
	}
	
	//	6. GOMB - KISÁLLAT/GAZDA TÖRLÉSE
	public void torles(int azonosito, int chipSzam) {
		System.out.println("--KISÁLLAT/GAZDA TÖRLÉSE--");
		System.out.println("Add meg a kisállat chipszámát "
				+ "vagy a gazda azonosítóját!");
		sc.nextInt();
		for (Gazda gazda2 : gazda) {
			for (Kisallat allat : kisallat) {
				if(allat.getChipSzam() == chipSzam) {
			}
			if(gazda2.getAzonosito() == azonosito) {
				break;
			}
		}
		gazda.remove(azonosito);
		}
	}
}
