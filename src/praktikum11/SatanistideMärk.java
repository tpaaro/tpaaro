package praktikum11;

import java.applet.Applet;
import java.awt.*;

import praktikum10.Ring;

public class SatanistideMärk extends Applet {

	public void paint(Graphics g) {
		int x0 = getWidth() / 2; // Keskpunkt
		int y0 = getHeight() / 2;
		int raadius = 100; // Raadius
		int sammudeArv = 5; // Nurkade arv
		int tiirudeArv = 2; // "Tiirude" arv
		double t0 = Math.PI/2 ; // Faas ehk kust alustada
		int x, y, eelmineX = 0, eelmineY = 0;
		double t;
		boolean esimene = true;

		// Kysime laiuse / ko~rguse
		int w = getWidth();
		int h = getHeight();

		// Katame tausta
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);

		// Joonistame
		// Viisnurk
		g.setColor(Color.black);

		for (t = 0; t <= 2 * tiirudeArv * Math.PI; t = t + 2 * tiirudeArv
				* Math.PI / sammudeArv) {
			x = (int) (raadius * Math.cos(t + t0) + x0);
			y = (int) (raadius * Math.sin(t + t0) + y0);
			if (esimene) {
				esimene = false;
			} else {
				g.drawLine(x, y, eelmineX , eelmineY);
			}
			eelmineX = x;
			eelmineY = y;
			// Ring
			g.setColor(Color.black);
			int keskkohtX = getWidth() / 2;
			int keskkohtY = getHeight() / 2;
			int r = 99;

			for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + .03) {
				int x2 = (int) (r * Math.cos(nurk));
				int y2 = (int) (r * Math.sin(nurk));
				g.fillRect(keskkohtX + x2, keskkohtY + y2, 3, 3);
			}
		}
	}

}
