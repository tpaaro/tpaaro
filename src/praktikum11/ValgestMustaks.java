package praktikum11;

/*Kirjuta programm, mis täidab ekraani tausta sujuva
 * üleminekuga valgest mustaks (üleval valge, all must).
 *Taibudele: kirjuta universaalsem meetod, mis lubab ette anda mistahes kaks värvi:
 *public void yleminek(Graphics g, Color varv1, Color varv2)
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class ValgestMustaks extends Applet {

	public void paint(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		int i;
		double x = 255;
		double samm =  x / h;


		for (i = 0; i < h; i = i + 1) {
			x -= samm;
			Color uus = new Color((int) x, (int) x, (int) x);
			g.setColor(uus);
			g.drawLine(i, 0, i, h);
			
			
		}

		/*
		 * } //public void yleminek(Graphics g, Color varv1, Color varv2){
		 * 
		 * 
		 */

	}
}
