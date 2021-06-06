package petDoctor.entity;

public class Kisallat {
	
	private String nev;
	private String fajta;
	private String tipus;
	private String szin;
	private int szuletesiDatum;
	private int suly;
	private int chipSzam;
	private Gazda gazda;
	private Oltas oltas;
	
	public Kisallat() {
	}
	
	public Kisallat(String nev, String fajta, String tipus, String szin, 
			int szuletesiDatum, int suly, int chipSzam) {
		super();
		this.nev = nev;
		this.fajta = fajta;
		this.tipus = tipus;
		this.szin = szin;
		this.szuletesiDatum = szuletesiDatum;
		this.suly = suly;
		this.chipSzam = chipSzam;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getFajta() {
		return fajta;
	}

	public void setFajta(String fajta) {
		this.fajta = fajta;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public String getSzin() {
		return szin;
	}

	public void setSzin(String szin) {
		this.szin = szin;
	}

	public int getSzuletesiDatum() {
		return szuletesiDatum;
	}

	public void setSzuletesiDatum(int szuletesiDatum) {
		this.szuletesiDatum = szuletesiDatum;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public int getChipSzam() {
		return chipSzam;
	}

	public void setChipSzam(int chipSzam) {
		this.chipSzam = chipSzam;
	}

	public Gazda getGazda() {
		return gazda;
	}

	public void setGazda(Gazda gazda) {
		this.gazda = gazda;
	}

	public Oltas getOltas() {
		return oltas;
	}

	public void setOltas(Oltas oltas) {
		this.oltas = oltas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KisAllat [nev=").append(nev).append(", fajta=").append(fajta).append(", tipus=").append(tipus)
				.append(", szin=").append(szin).append(", szuletesiDatum=").append(szuletesiDatum).append(", suly=")
				.append(suly).append(", chipSzam=").append(chipSzam).append("]");
		return builder.toString();
	}
}
