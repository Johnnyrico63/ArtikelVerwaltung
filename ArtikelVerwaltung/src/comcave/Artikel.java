package comcave;

public class Artikel
{
	private String bezeichnung;
	private double preis;
	private int anzahl;

	public Artikel(String bezeichnung, double preis, int anzahl)
	{
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.anzahl = anzahl;
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
