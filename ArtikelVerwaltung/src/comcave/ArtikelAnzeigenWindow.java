package comcave;

import java.awt.Font;

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
		
		scrollPane.setBounds(20, 20, 560, 460);
	}
}
