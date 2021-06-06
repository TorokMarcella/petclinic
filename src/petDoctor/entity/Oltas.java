package petDoctor.entity;

import java.util.Date;

public class Oltas {
	
	private Date datum;
	private Date ervenyesseg;
	private String mireKapta;
	
	public Oltas() {
	}

	public Oltas(Date datum, Date ervenyesseg, String mireKapta) {
		super();
		this.datum = datum;
		this.ervenyesseg = ervenyesseg;
		this.mireKapta = mireKapta;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	public Date getErvenyesseg() {
		return ervenyesseg;
	}
	
	public void setErvenyesseg(Date ervenyesseg) {
		this.ervenyesseg = ervenyesseg;
	}

	public String getMireKapta() {
		return mireKapta;
	}

	public void setMireKapta(String mireKapta) {
		this.mireKapta = mireKapta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Oltas [datum=").append(datum).append(", ervenyesseg=").append(ervenyesseg)
				.append(", mireKapta=").append(mireKapta).append("]");
		return builder.toString();
	}

}
