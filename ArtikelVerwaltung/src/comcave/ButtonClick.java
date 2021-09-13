package comcave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClick implements ActionListener
{
	// 1. Datenbank-Server, Connector/KLassenbibliothek einbinden
		// Projekt Rechtsklick -> Build Path -> Configure Build Path -> Libaries ->
	// 2. Verbindung aufbauen
	// 3. Statement einfuegen, SQL Statements/Befehle an den DB-Server senden

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

		Artikel artikel = new Artikel(bez, preis, anz);
		//Datenbank datenbank = new Datenbank();
		Datenbank.artikelSpeichern(artikel);
	}
}
