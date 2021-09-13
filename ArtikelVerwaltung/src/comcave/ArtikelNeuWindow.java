package comcave;

import java.awt.*;

import javax.swing.*;


public class ArtikelNeuWindow extends JFrame
{
	JLabel lblBezeichnung;
	JLabel lblPreis;
	JLabel lblAnzahl;
	JLabel lblDatum;

	JTextField tfBezeichnung;
	JTextField tfPreis;
	JTextField tfAnzahl;
	JTextField tfDatum;

	JButton btnSpeichern;

	JPanel contentPane;
	


	public ArtikelNeuWindow()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Disponse on close - nur das sub-Fenster wird geschlossen
		setSize(450, 250);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblBezeichnung = new JLabel("Bezeichnung");
		lblPreis = new JLabel("Preis");
		lblAnzahl = new JLabel("Anzahl");
		lblDatum = new JLabel("Datum");

		tfBezeichnung = new JTextField();
		tfPreis = new JTextField();
		tfAnzahl = new JTextField();
		tfDatum = new JTextField();

		btnSpeichern = new JButton("speichern");

		contentPane.add(lblBezeichnung);
		contentPane.add(lblPreis);
		contentPane.add(lblAnzahl);
		contentPane.add(lblDatum);
		contentPane.add(tfBezeichnung);
		contentPane.add(tfPreis);
		contentPane.add(tfAnzahl);
		contentPane.add(tfDatum);
		contentPane.add(btnSpeichern);

		lblBezeichnung.setBounds(20, 20, 150, 25);
		lblPreis.setBounds(20, 55, 150, 25);
		lblAnzahl.setBounds(20, 90, 150, 25);
		lblDatum.setBounds(20, 125, 150, 25);
		tfBezeichnung.setBounds(180, 20, 250, 25);
		tfPreis.setBounds(180, 55, 250, 25);
		tfAnzahl.setBounds(180, 90, 250, 25);
		tfDatum.setBounds(180, 125, 250, 25);
		btnSpeichern.setBounds(120, 160, 150, 25);

		Font font = new Font("Calibri", Font.BOLD, 16);

		lblBezeichnung.setFont(font);
		lblPreis.setFont(font);
		lblAnzahl.setFont(font);
		lblDatum.setFont(font);
		tfBezeichnung.setFont(font);
		tfPreis.setFont(font);
		tfAnzahl.setFont(font);
		tfDatum.setFont(font);
		btnSpeichern.setFont(font);
		
		
//		tfDatum.setFont(font);
		tfDatum.setColumns(10);

		btnSpeichern.addActionListener(new ButtonClick(this));
	}
}
