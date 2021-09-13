package comcave;

import java.awt.Font;

import javax.swing.*;

public class ArtikelNeuWindow extends JFrame
{
	JLabel lblBezeichnung;
	JLabel lblPreis;
	JLabel lblAnzahl;
	
	JTextField tfBezeichnung;
	JTextField tfPreis;
	JTextField tfAnzahl;
	
	JButton btnSpeichern;
	
	JPanel contentPane;
	
	
	public ArtikelNeuWindow()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//Disponse on close - nur das sub-Fenster wird geschlossen
		setSize(450, 200);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBezeichnung = new JLabel("Bezeichnung");
		lblPreis = new JLabel("Preis");
		lblAnzahl = new JLabel("Anzahl");
		
		tfBezeichnung = new JTextField();
		tfPreis = new JTextField();
		tfAnzahl = new JTextField();
		
		btnSpeichern = new JButton("speichern");
		
		contentPane.add(lblBezeichnung);
		contentPane.add(lblPreis);
		contentPane.add(lblAnzahl);
		contentPane.add(tfBezeichnung);
		contentPane.add(tfPreis);
		contentPane.add(tfAnzahl);
		contentPane.add(btnSpeichern);
		
		lblBezeichnung.setBounds(20, 20, 150, 25);
		lblPreis.setBounds(20, 55, 150, 25);
		lblAnzahl.setBounds(20, 90, 150, 25);
		tfBezeichnung.setBounds(180, 20, 250, 25);
		tfPreis.setBounds(180, 55, 250, 25);
		tfAnzahl.setBounds(180, 90, 250, 25);
		btnSpeichern.setBounds(120, 125, 150, 25);
		
		Font font = new Font("Calibri", Font.BOLD, 16);
		
		lblBezeichnung.setFont(font);
		lblPreis.setFont(font);
		lblAnzahl.setFont(font);
		tfBezeichnung.setFont(font);
		tfPreis.setFont(font);
		tfAnzahl.setFont(font);
		btnSpeichern.setFont(font);
		
		btnSpeichern.addActionListener(new ButtonClick(this));
	}
}
