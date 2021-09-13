package comcave;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

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
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600, 500);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		scrollPane = new JScrollPane(table);
		model = new DefaultTableModel();
		
		contentPane.add(scrollPane);
		
		scrollPane.setBounds(20, 20, 560, 420);
		
		// JTable mit Daten fuellen
		ArrayList<Artikel> artikelListe = Datenbank.artikelAbrufen();
		// 1. Vector fuer Spalten-Ueberschriften
		Vector<String> kopf = new Vector<String>();
		kopf.add("Bezeichnung");
		kopf.add("Preis");
		kopf.add("Anzahl");
		
		// 2. Vector fur Daten
		Vector<Vector<String>> daten = new Vector<Vector<String>>();
		
		for(Artikel artikel : artikelListe)
		{
			Vector zeile = new Vector<String>();
			zeile.add(artikel.getBezeichnung());
			zeile.add(Double.toString(artikel.getPreis()));
			zeile.add(Integer.toString(artikel.getAnzahl()));
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
