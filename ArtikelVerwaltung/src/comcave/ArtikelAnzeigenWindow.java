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
		// 1 Vector fuer Spalten-Ueberschriften
		Vector<String> kopf = new Vector<String>();
		kopf.add("Bezeichnung");
		kopf.add("Preis");
		kopf.add("Anzahl");
		
		//Test
//		for( Artikel artikel : artikelListe)
//		{
//			System.out.println(artikel.getBezeichnung());
//		}
	}
}
