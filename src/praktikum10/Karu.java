package praktikum10;

import java.applet.Applet;
import java.awt.*;

public class Karu extends Applet {

	public void paint(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		
		// Katame tausta
				g.setColor(Color.white);
				g.fillRect(0, 0, w, h);
        // Joonistame
				// Ulemine osa - pea ja n2odetailid
				g.setColor(Color.black);
				g.drawRect(10, 10, 200, 200); // Kast
				
				g.setColor(Color.red);
				g.fillOval( 80, 20, 65, 65 ); //Pea
				
				g.fillOval(80, 15, 20 , 20); // Vasak k6rv
				g.fillOval(130, 15 , 20, 20); //Parem k6rv
				
				g.setColor(Color.black);
				g.fillOval( 90, 35, 15, 15 );
				g.fillOval( 115, 35, 15, 15 ); //Silmad
				
				g.fillOval( 106, 50, 10, 10); // Nina
				
				g.setColor(Color.black);
				g.drawRect(110, 56, 1, 10); // Ninaalune kriips
				g.drawRect(104, 66, 15, 1); // Suu
				
				//Keha
				g.setColor(Color.red);
				g.fillOval(70, 80, 80, 100);
				//Jalad
				g.fillOval(90, 170, 20, 40); //Vasak
				g.fillOval(110, 170, 20, 40); //Parem
				//K2ed
				g.fillOval(40, 100, 50, 10); //Vasak
				g.fillOval(130, 100, 50, 10);//Parem
				
				g.setColor(Color.black);
				g.drawString("Rawr!", 10, 230);
	}

}
