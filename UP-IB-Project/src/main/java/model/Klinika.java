package model;

import java.util.ArrayList;

public class Klinika {
	
	private String naziv;
	private String adresa;
	private String opis;
	private Termin slobodniTermin;
	private String spisakLekara;
	private Cenovnik cenovnik;
	
	public Klinika (String naziv, String adresa, String opis, Termin slobodniTermin, String spisakLekara, Cenovnik cenovnik) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.slobodniTermin = slobodniTermin;
		this.spisakLekara = spisakLekara;
		this.cenovnik = cenovnik;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Termin getSlobodniTermin() {
		return slobodniTermin;
	}

	public void setSlobodniTermin(Termin slobodniTermin) {
		this.slobodniTermin = slobodniTermin;
	}

	public String getSpisakLekara() {
		return spisakLekara;
	}

	public void setSpisakLekara(String spisakLekara) {
		this.spisakLekara = spisakLekara;
	}

	public Cenovnik getCenovnik() {
		return cenovnik;
	}

	public void setCenovnik(Cenovnik cenovnik) {
		this.cenovnik = cenovnik;
	}

	@Override
	public String toString() {
		return "Klinika [naziv=" + naziv + ", adresa=" + adresa + ", opis=" + opis + ", slobodniTermin="
				+ slobodniTermin + ", spisakLekara=" + spisakLekara + ", cenovnik=" + cenovnik + "]";
	}
	
	
	
}
