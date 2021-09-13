package comcave;

import java.sql.*;
import java.text.*;
import java.util.ArrayList;

public class Datenbank
{
	public static void artikelSpeichern(Artikel artikel)
	{
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		try
		{
			String conString = "jdbc:mysql://localhost/javadb";
			String user = "muster";
			String password = "muster";
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();
			String sqlString = "INSERT INTO artikel(bezeichnung, preis, anzahl, datum)" 
											+ " VALUES('" 	+ artikel.getBezeichnung() + "','" 
															+ artikel.getPreis() + "','" 
															+ artikel.getAnzahl() + "','" 
															+ df.format(artikel.getDatum()) + "');";
			System.out.println(sqlString);
			stat.execute(sqlString);

			// Alle Artikeldaten abrufen
//			sqlString = "SELECT * FROM artikel;";
//			ResultSet rs = stat.executeQuery(sqlString);
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getDouble(3) + rs.getInt(4));
//			}


			con.close();
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}

	public static ArrayList<Artikel> artikelAbrufen()
	{
		ArrayList<Artikel> artikelListe = new ArrayList<>();
		try
		{
			//Verbindung zu DB aufbauen
			String conString = "jdbc:mysql://localhost/javadb";
			String user = "muster";
			String password = "muster";
			Connection con = DriverManager.getConnection(conString, user, password);
			Statement stat = con.createStatement();

			//Daten abrufen
			String sqlString = "SELECT bezeichnung, preis, anzahl, datum FROM artikel;";
			ResultSet rs = stat.executeQuery(sqlString);
			while(rs.next())
			{
				artikelListe.add(new Artikel(rs.getString(1) , rs.getDouble(2) , rs.getInt(3), rs.getDate(4)));
			}

			con.close();
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
		return artikelListe;
	}
}
