package comcave;

import java.util.Date;

public class Artikel
{
	private String bezeichnung;
	private double preis;
	private int anzahl;
	private Date datum;
	
	public Artikel()
	{
		
	}

	public Artikel(String bezeichnung, double preis, int anzahl, Date datum)
	{
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.anzahl = anzahl;
		this.datum = datum;
	}
	
	public Date getDatum()
	{
		return datum;
	}
	
	public void setDatum(Date datum)
	{
		this.datum = datum;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

}
