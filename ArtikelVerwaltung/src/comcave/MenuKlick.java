package comcave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuKlick implements ActionListener
{
	MainWindow mw;

	public MenuKlick(MainWindow mw)
	{
		this.mw = mw;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(mw.menuItemArtikelNeu))
		{
			new ArtikelNeuWindow().setVisible(true);
		}
		else if(e.getSource().equals(mw.menuItemArtikelAnzeigen))
		{
			new ArtikelAnzeigenWindow().setVisible(true);
		}
	}
}
