package praktikum10;

import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;
import java.awt.image.*;

/**
 * Nii.. see kurikuulus spiraalijoonistamine.
 * teeme siis nii, et on üks klass, mis laiendab lihtsalt graafilist klassi Canvas
 * ja paneme ta siis enda sisse Spiraali joonistama
 * mis see spiraal siis endast kujutab? Lihtsalt järjest suureneva raadiusega Ringi :)
 * implements AdjustmentListener on üks lahendustest, kuidas teda ScrollBari järgi 
 * tantsima panna
 **/
public class Spiraal extends Canvas
    implements Runnable, AdjustmentListener, ComponentListener {
	
    //3.1415926535897932384626433832795
    //kuna see asi siin joonistab, sin ja cos abil, siis on peris talutav
    //hoida muutujaid double kujul ja siis alles joonistamiseks teha "ümardus" int kujule

    //PI hoiab enda sees arvu pii, lihtsalt ilus konstant :)
    final double PI = 3.141592653589793;
    
    //a ja b jäävad endas hoidma keskkohta, samm on siis spiraali keerdude vahe
    //paneme ta alustuseks siis 10 - ks ilu pärast
    double a, b, samm = 10;

    //x, y ja x1, y1 on need, mille vahele veetakse alati joon
    //r on raadius, mis peaks siis suurenema alati ilusti iga keeru lõpuks samm võrra
    double x, y, x1, y1, r;

    //sek nigu "sektoreid" mida suurem on see arv, seda väiksemateks juppideks jaotame ringi,
    //seda sujuvam tuleb spiraal ja seda kauem võtab pisikesel arvutikesel aega, et
    //Spiraalikene joonistada, sest seda rohkem sektoreid tuleb :) ilus lause :H
    //
    //vihje: kui sek = 12, siis peaks ta ringi jagama 12 võrdseks ilusaks osaks, nigu kellaplaat
    //antud 48 teeb lihtsalt natuke sujuvama spiraali.
    //proovi ka näiteks 3 või 4 -ga :) lahe
    double sek = 48;
    double rad = 0, kraad = PI/24;
    
    int timeOut = 100;
    BufferedImage bi;
    //Ehhee.. mõtle ise, mis teeb!
    Spiraal(){
    	new Thread(this).start();
	addComponentListener(this);
    }
    
    /**
     * Paint...
     **/
    public void paint(Graphics gr){	    
	    gr.drawImage(bi, 0, 0, this); 
    }

    public void run(){
    	//System.out.println("Böö");
	while(true){
	    rad += kraad;
	    if(rad > 2*PI){
	    	rad -= 2*PI;
	    }
	    try{
	    	Thread.sleep(timeOut);
	    }catch(InterruptedException e){}
	    
	    if(bi != null){
    	    	Graphics g = bi.getGraphics();
	    	g.setColor(Color.white);
	    	g.fillRect(0, 0, bi.getWidth(), bi.getHeight());
	    	g.setColor(Color.black);
	    	//Leiame siis keskkoha
            	x = a = getSize().width / 2;
	    	y = b = getSize().height / 2;
	    	//g.drawOval((int)x, (int)y, 10, 10);

	    	//Raadius nulliks joonistamise alguses
	    	r = 0;

	    	//for tsükkel hakkab spiraali sektor haaval joonistama, nurka järjest suurendades
	    	//tähtis on ka raadiust suurendada.. sest selle järgi toimub tsükli lõpetamine
	    	for(double z = rad+(2*PI/sek);(r<a) || (r<b);z+=2*PI/sek){
    		    if(z > 2*PI) z-=2*PI;
	    	    //raadius sektori jagu suuremaks
	    	    r += samm/sek;
	    	    //arvutame uued koordinaadid
	    	    x1 = r * Math.cos(z) + a;
	    	    y1 = r * Math.sin(z) + b;

	    	    //ja tõmbame joone eelmise ja vast arvutatud koordinaadi vahele
	    	    g.drawLine((int)x, (int)y, (int)x1, (int)y1);
	    
	    	    //teeme vast arvutatud koordinaadist eelmise ja ...
	    	    x = x1;
	    	    y = y1;
	    	    //  ...hakkabki tsükkel jälle otsast peale :)
	    	}
	    	    
	    	repaint();	    
	    }
	}
    }

    /**
     * See on nüüd meetod, mis tuleb siia kuna Spiraal peab oskama ennast scrollbari järgi sättida.
     * juhul kui antud komponent on pandud addAdjustmentListener meetod mingi teise objekti kuulajaks,
     * siis kutsutakse see meetod siit esile
     **/
    public void adjustmentValueChanged(AdjustmentEvent e){
	//küsime kutsuja seest (kuna oletatavasti on see Scrollbar.. ) vajaliku väärtuse
	//ja paneme samm nimelisse muutujasse. samm teatavasti näitas omakorda keerdude vahet :)
	if(e.getSource() instanceof Scrollbar){
	    String name = ((Scrollbar) e.getSource()).getName();
	    if(name.equals("Keeruvahe")){
	    	samm = ((Scrollbar)e.getSource()).getValue();
	    	System.out.println("" + samm);
	    	repaint();
	    }else if(name.equals("timeOut")){
	    	timeOut = ((Scrollbar)e.getSource()).getValue();
	    	System.out.println("" + timeOut);
	    }
	}
    }
    
    public void componentResized(ComponentEvent e){
    	bi = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_RGB);
    }

    public void componentShown(ComponentEvent e){}
    public void componentHidden(ComponentEvent e){}
    public void componentMoved(ComponentEvent e){}
    
    /**
     * public static void main(String args[])
     * Ehk teisisõnu see, kust kõik asi tegelikult alles alguse saab (juhul kui praegu ees olev
     * klass applicationina (käsurealt: java Spiraal) käima panna.
     * Teeb siis kõigepealt Frame-i, millele paneb külge WindowListeneri, et kui hiirega ristile vajutad,
     * siis läheb ilusti programmist välja... Edasi paneb paika akna (Frame'i) suuruse ja hakkab siis sinna
     * vastvalminud aknasse asju sisse panema ( add(see) ja add(teine) ja ... ) Kõigelõpuks ütleb veel
     * aknale, et ta ennast ka näitaks ( show() )
     **/
    public static void main(String args[]){
	Frame f = new Frame("Spiraal");
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		    System.exit(0);
		}
	    });
	//aknale sai pandud ka mingi layout manager, mis peaks ise oskama öelda, kuhu temas parasjagu
	//sees olevad komponendid joonistada ja kui suurelt.. Seda ka siis, kui mõne komponendi suurus
	//pärast joonistamist ka natuke muutub (kasvõi akna suurust muutes.. seda hiirega vedades)
	//
	//BorderLayout üldse selline peris lahe asi.. kõigepealt üritab see võimalikult väikeselt joonistada
	//kõik akna serva lähedased asjad ( NORTH, EAST, SOUTH, WEST ) nii palju, kui neid on.
	//ja seejärel ülejäänud akna pinnale, nii suurelt kui võimalik, keskmise asja ( CENTER )
	f.setLayout(new BorderLayout());
	f.setSize(200, 200);

	//Teeb isendi käesolevast klassist Spiraal
	Spiraal s = new Spiraal();
	//paneb talle mingi suuruse .. BorderLayouti puhul ei lähe seda ehk vajagi.. 
	//Layout manager arvutab tema suuruse ise.. heal juhul :)
	//s.setSize(200, 200);

	//Peale Spiraali tegemist tuleb ta ka aknasse asetada.
	//muutuja nimega s sai pandud Spiraalile viitama.. selle abil paneme ta ka aknasse...
	f.add(s, BorderLayout.CENTER);

	//oletatavasti on spiraal nyyd saanud suurused.. laseme tal endale ilusa pildi mõelda
	//Teeme Scrollbar'i ja paneme minimum valueks 1.
	//on tähtis, et minimum ei oleks sellest väiksem (0)!!!
	//muidu võib vaene Spiraalikene ennast joonistama jäädagi.
	//setValue(10) on siin lihtsalt selle pärast, et spiraal joonistab ennast alguses 10-se vahega
	Scrollbar c = new Scrollbar(Scrollbar.VERTICAL);
	c.setName("Keeruvahe");
	c.setMinimum(1);
	c.setMaximum(300);
	c.setValue(10);
	//Järgnev programmirida on nüüd see, mis paneb Spiraali ennast Scrollbar'i järgi sättima
	//Või tegelikult hoopis ütleb Scrollbari'le, et Spiraal kuulaku teda hästi hoolega
	c.addAdjustmentListener(s);

	//Paneme jälle ka Scrollbar'i aknasse
	f.add(c, BorderLayout.EAST);

	//Teeme veel ühe ScrollBar'i, kasutades selleks sama pointerit ;)
	c = new Scrollbar(Scrollbar.HORIZONTAL);
	c.setName("timeOut");
	c.setMinimum(10);
	c.setMaximum(200);
	c.setValue(100);
	c.addAdjustmentListener(s);
	
	f.add(c, BorderLayout.SOUTH);
	
	//ja näitame akent ka lollile kasutajale.
	f.show();
    }
}