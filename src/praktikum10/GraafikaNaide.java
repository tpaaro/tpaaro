package praktikum10;

import java.applet.Applet;
import java.awt.*;

public class GraafikaNaide extends Applet {
	public void paint(Graphics g) {
		// Kysime laiuse / ko~rguse
		int w = getWidth();
		int h = getHeight();
		
		// Katame tausta
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);
		
		// Joonistame
		g.setColor(Color.black);
		g.drawRect(10, 10, 200, 200);
		
		g.setColor(Color.blue);
		g.fillOval( 20, 20, 180, 180 );

		g.setColor(Color.yellow);
		g.fillOval( 45, 50, 60, 40 );
		g.fillOval( 115, 50, 60, 40 );

		g.setColor(Color.white);
		g.fillRect( 50, 140, 120, 15 );

		g.setColor(Color.green);
		g.drawString("Mina olen sinine mehike marsilt!", 10, 230);
	}
}
