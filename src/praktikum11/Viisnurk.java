package praktikum11;

import java.applet.Applet;
import java.awt.*;

public class Viisnurk extends Applet {
    @Override
    public void paint(Graphics g) {
        int x0 = getWidth()/2; // Keskpunkt
        int y0 = getHeight()/2;
        int raadius = 100; // Raadius
        int nurkadeArv = 6; // Nurkade arv
        int x, y, eelmineX = 0, eelmineY = 0;
        boolean esimene = true;

        // Kysime laiuse / ko~rguse
        int w = getWidth();
        int h = getHeight();

        // Katame tausta
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);

        // Joonistame
        g.setColor(Color.black);

        for (double t = -Math.PI; t <= Math.PI; t = t + 2 * Math.PI / nurkadeArv) {
            x = (int) (raadius * Math.cos(t) + x0);
            y = (int) (raadius * Math.sin(t) + y0);
            if (esimene) {
                esimene = false;
            }
            else {
                g.drawLine(eelmineX, eelmineY, x, y);
            }
            eelmineX = x;
            eelmineY = y;
        }
    }
}