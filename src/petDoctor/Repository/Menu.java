package petDoctor.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import elsoBlokkzaro.entity.Gazda;
import elsoBlokkzaro.entity.Kisallat;
import elsoBlokkzaro.entity.Oltas;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	List gazdaList = new ArrayList<Gazda>();
	List allatList = new ArrayList<Kisallat>();
	
	public void gazdi() {
		
		//	1. GOMB GAZDI FELVITELE
		System.out.println("--GAZDI FELVITELE--");
		System.out.println("Gazdi neve: ");
		String nev = sc.next();
		System.out.println("Gazdi azonosítója: ");
		int azonosito = sc.nextInt();
		System.out.println("Gazdi e-mail címe: ");
		String eMail = sc.next();
		System.out.println("Gazdi telefonszáma: ");
		int telefonszam = sc.nextInt();
		
		Gazda gaz = new Gazda(nev, azonosito, eMail, telefonszam);
		gazdaList.add(gaz);
	}
	
	public void kisallat() {
		System.out.println("--KISÁLLAT FELVITELE--");
		System.out.println("Kisállat neve: ");
		String nevK = sc.next();
		System.out.println("Kisállat fajtája: ");
		String fajta = sc.next();
		System.out.println("Kisállat típusa: ");
		String tipus = sc.next();
		System.out.println("Kisállat színe: ");
		String szin = sc.next();
		System.out.println("Kisállat születési dátuma: ");
		int szuletesiDatum = sc.nextInt();
		System.out.println("Kisállat súlya: ");
		int suly = sc.nextInt();
		System.out.println("Kisállat chipszáma: ");
		int chipSzam = sc.nextInt();
		
		Kisallat allat = new Kisallat(nevK, fajta, tipus, szin, szuletesiDatum, suly, chipSzam);
		allatList.add(allat);
	}

	public static void udvozlo() {
		System.out.println("Az alábbi menüpontok közül választhatsz:\r\n"
				+ "1: Gazdi felvitele\r\n"
				+ "2: Kisállat felvitele\r\n"
				+ "3: Kisállat keresése\r\n"
				+ "4: Talált kisállat beazonosítása\r\n"
				+ "5: Oltás felvitele\r\n"
				+ "6: Kisállat/gazda törlése\r\n"
				+ "7: Exportálás\r\n"
				+ "0: üdvözlõszöveg\r\n"
				+ "8: alkalmazás vége");
	}
	
	//	8. GOMB ALKALMAZÁS VÉGET ÉRT
	public static void alkalmazasVege() {
		System.out.println("Az alkalmazás véget ért");
		System.exit(0);

	}

}

