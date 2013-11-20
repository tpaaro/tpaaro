package praktikum11;

/*Kirjuta programm, mis täidab ekraani tausta sujuva
 * üleminekuga valgest mustaks (üleval valge, all must).
 *Taibudele: kirjuta universaalsem meetod, mis lubab ette anda mistahes kaks värvi:
 *public void yleminek(Graphics g, Color varv1, Color varv2)
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ValgestMustaks extends Applet {

	public void paint(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		
			g.setColor(Color.black);
			g.fillRect(0, 0, w, h);

			g.setColor(Color.white);
			g.fillRect(0, 0, w, h);

			/**
			 * } //public void yleminek(Graphics g, Color varv1, Color varv2){
			 * varv1 = Color.black; varv2 = Color.white
			 */

		}
	}

