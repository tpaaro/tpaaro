package praktikum10;

import java.awt.*;		// use existing graphics code
import java.applet.*;	// use existing applet code

// Create an applet and draw a spiral.

public class Spiraalike extends Applet  // this is the applet
{
	int lengthIncrement = 5 ; // the increment in line length after a line is drawn
	int length = lengthIncrement ;		// the length of the line to be drawn
	int startx = 250;		// the start x coord of the line
	int starty = 250 ;		// the start y coord of the line
	int endx ; 		// the end x coord of the line
	int endy ;		// the end y position of the line

	public void paint(Graphics g)		// this does the drawing
	{
				
		g.setColor(Color.black) ;	// set the pen colour
		
		// start drawing lines, 4 per iteration
		for ( int count = 1 ; count <= 40  ; count += 4)
		{
			// start by drawing a vertical line upwards
			endx = startx ;			// set the end coords of the line
			endy = starty - length ;
			g.drawLine(startx,starty,endx,endy) ; // draw the line
			length = length + lengthIncrement ; // update length
			startx = endx ;	// reset the start of the line
			starty = endy ;
			
			// then draw a horizontal line to right
			endx = startx + length ;	// set the end coords of the line
			endy = starty ;
			g.drawLine(startx,starty,endx,endy) ; // draw the line
			length = length + lengthIncrement ;	// update length
			startx = endx ;	// reset the start of the line
			starty = endy ;
			
			// then draw a vertical line downwards 
			endx = startx ;	// set the end coords of the line
			endy = starty + length ;
			g.drawLine(startx,starty,endx,endy) ; // draw the line
			length = length + lengthIncrement ;   	// update length
			startx = endx ;	// reset the start of the line
			starty = endy ;
			
			// finally draw a horizontal line to left
			endx = startx - length ; // set the end coords of the line
			endy = starty ;
			g.drawLine(startx,starty,endx,endy) ;  // draw the line
			length = length + lengthIncrement ;	// update length
			startx = endx ;	// reset the start of the line
			starty = endy ;
		}		
	}
}