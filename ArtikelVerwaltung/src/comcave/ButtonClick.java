package comcave;

import java.awt.event.*;
import java.util.Date;

public class ButtonClick implements ActionListener
{
	// 1. Datenbank-Server, Connector/KLassenbibliothek einbinden
		// Projekt Rechtsklick -> Build Path -> Configure Build Path -> Libaries ->
	// 2. Verbindung aufbauen
	// 3. Statement einfuegen, SQL Statements/Befehle an den DB-Server senden
	// 4. Verbindung schliessen

	ArtikelNeuWindow w;

	public ButtonClick(ArtikelNeuWindow w)
	{
		this.w = w;
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		String bez = w.tfBezeichnung.getText();
		double preis = Double.parseDouble(w.tfPreis.getText());
		int anz = Integer.parseInt(w.tfAnzahl.getText());
		String[] d = w.tfDatum.getText().split("\\.");
		@SuppressWarnings("deprecation")
		Date datum = new Date(
				Integer.parseInt(d[2]) - 1900,
				Integer.parseInt(d[1]) - 1,
				Integer.parseInt(d[0])
				); //tag.Monat.jahr / dd.MM.yyyy / 20.09.2021

		Artikel artikel = new Artikel(bez, preis, anz, datum);
		//Datenbank datenbank = new Datenbank();
		Datenbank.artikelSpeichern(artikel);
		
		//Datenbank.artikelSpeichern( new Artikel(w.tfBezeichnung.getText(), Double.parseDouble( w.tfPreis.getText() ), Integer.parseInt( w.tfAnzahl.getText() )) );
	}
}
