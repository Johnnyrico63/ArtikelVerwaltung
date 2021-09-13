package comcave;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ArtikelAnzeigenWindow extends JFrame
{
	JPanel contentPane;
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model;

	public ArtikelAnzeigenWindow()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Disponse on Close, NUR das Sub-Fenster schliessen
		setSize(600, 500);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane);
		scrollPane.setBounds(20, 20, 560, 420);

		// JTable mit Daten fullen
		ArrayList<Artikel> artikelListe = Datenbank.artikelAbrufen();
		
		// 1. Vector fur Spalten-Uberschriften
		Vector<String> kopf = new Vector<>();
		kopf.add("Bezeichnung");
		kopf.add("Preis");
		kopf.add("Anzahl");
		kopf.add("Datum");
		kopf.add("Gesamtpreis");

		// 2. Vector fur Daten
		Vector<Vector<String>> daten = new Vector<>();

		for(Artikel artikel : artikelListe)
		{
			Vector zeile = new Vector<String>();
			zeile.add(artikel.getBezeichnung());
			zeile.add(Double.toString(artikel.getPreis()));
			zeile.add(Integer.toString(artikel.getAnzahl()));
			zeile.add(new SimpleDateFormat("dd.MM.yyyy").format(artikel.getDatum()));
			zeile.add(Double.toString(artikel.getPreis()*artikel.getAnzahl()));
			daten.add(zeile);
		}
		
		model = new DefaultTableModel(daten, kopf);
		table.setModel(model);
		
		//Test
//		for( Artikel artikel : artikelListe)
//		{
//			System.out.println(artikel.getBezeichnung());
//		}
	}
}
