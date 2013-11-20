package praktikum11;

import java.applet.Applet;
import java.awt.*;

public class Tiivik extends Applet {
	/*
	 * Ringjoone vo~rrand parameetrilisel kujul 
	 * x = r * cos(t) 
	 * y = r * sin(t) == -PI..PI
	 */
	public void paint(Graphics g) {
		int x0 = 250; // Keskpunkt
		int y0 = 250;
		int r = 125; // Raadius
		int x, y, eelmineX = 0, eelmineY = 0;
		double t;
		boolean esimene = true;

		// Kysime kui suur aken on?
		int w = getWidth();
		int h = getHeight();

		// Täidame tausta
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		// Joonistame
		g.setColor(Color.black);

		for (t = -Math.PI; t < Math.PI; t = t + Math.PI / 8) {
			x = (int) (r * Math.cos(t) + x0);
			y = (int) (r * Math.sin(t) + y0);
			g.drawLine(x0, y0, x, y);

			if (esimene) {
				esimene = false;

			} else {
				g.drawLine(eelmineX, eelmineY, x, y);
			}
			eelmineX = x;
			eelmineY = y;

		}
	}
}