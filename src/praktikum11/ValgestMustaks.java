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
		int i;
		double x = 255;
		double samm = 255 / h;

		Color valge = new Color((int) x, (int) x, (int) x);

		for (i = 0; i < h; i = i + 1) {
			x = x - samm;
			Color uus = new Color((int) x, (int) x, (int) x);
			g.setColor(uus);
			g.drawLine(0, i, w, i);
		}

		/*
		 * } //public void yleminek(Graphics g, Color varv1, Color varv2){
		 */

	}
}
