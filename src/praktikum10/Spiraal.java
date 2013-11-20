package praktikum10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class Spiraal extends Applet {

	private Graphics g;

	public void paint(Graphics g) {
		this.g = g;
		joonistaTaust();
		joonistaSpiraal();
	}

	/**
	 * Katab tausta valgega
	 */
	public void joonistaTaust() {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);
	}

	
	public void joonistaSpiraal() {

		g.setColor(Color.black);
		int keskkohtX = getWidth() / 2;
		int keskkohtY = getHeight() / 2;
		int raadius = 50;
		for (raadius = 1; raadius < 120; raadius += 20){
			
			for (double nurk = 0; nurk <= Math.PI * 2; nurk = nurk + .03) {
				
				int x = (int) (raadius * Math.cos(nurk));
				int y = (int) (raadius * Math.sin(nurk));
				
				g.fillRect(keskkohtX + x, keskkohtY + y, 3, 3);
			}
		}
	}
}
