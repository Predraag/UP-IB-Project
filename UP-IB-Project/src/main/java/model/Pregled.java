package model;

import java.util.Date;

public class Pregled {
	
	private Date datumVremePregleda;
	private int trajanjePregleda;
	private String lekar;
	private String medicinskaSestra;
	private Double cena;
	
	public Pregled(Date datumVremePregleda, int trajanjePregleda, String lekar, String medicinskaSestra,
			Double cena) {
		super();
		this.datumVremePregleda = datumVremePregleda;
		this.trajanjePregleda = trajanjePregleda;
		this.lekar = lekar;
		this.medicinskaSestra = medicinskaSestra;
		this.cena = cena;
	}

	public Date getDatumVremePregleda() {
		return datumVremePregleda;
	}

	public void setDatumVremePregleda(Date datumVremePregleda) {
		this.datumVremePregleda = datumVremePregleda;
	}

	public int getTrajanjePregleda() {
		return trajanjePregleda;
	}

	public void setTrajanjePregleda(int trajanjePregleda) {
		this.trajanjePregleda = trajanjePregleda;
	}

	public String getLekar() {
		return lekar;
	}

	public void setLekar(String lekar) {
		this.lekar = lekar;
	}

	public String getMedicinskaSestra() {
		return medicinskaSestra;
	}

	public void setMedicinskaSestra(String medicinskaSestra) {
		this.medicinskaSestra = medicinskaSestra;
	}

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}
	
	
	
}
