package petDoctor.entity;

import java.util.ArrayList;
import java.util.List;

public class Gazda {
	
	private String nev;
	private Integer azonosito;
	private String eMail;
	private int telefonszam;
	private List<Kisallat> kisallat = new ArrayList<>();
	
	public Gazda() {
	}
	
	public Gazda(String nev, Integer azonosito, String eMail, int telefonszam) {
		super();
		this.nev = nev;
		this.azonosito = azonosito;
		this.eMail = eMail;
		this.telefonszam = telefonszam;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public Integer getAzonosito() {
		return azonosito;
	}

	public void setAzonosito(Integer azonosito) {
		this.azonosito = azonosito;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getTelefonszam() {
		return telefonszam;
	}

	public void setTelefonszam(int telefonszam) {
		this.telefonszam = telefonszam;
	}

	public List<Kisallat> getKisallat() {
		return kisallat;
	}

	public void setKisallat(List<Kisallat> kisallat) {
		this.kisallat = kisallat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gazda [nev=").append(nev).append(", azonosito=").append(azonosito).append(", eMail=")
				.append(eMail).append(", telefonszam=").append(telefonszam).append("]");
		return builder.toString();
	}
	

}
