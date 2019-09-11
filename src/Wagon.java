
import hsa.Console;
import java.awt.Color;


import hsa.Console;
import java.awt.Color;


public class Wagon {

   
   public static void main(String[ ] args) {
  	Console c = new Console();
  	c.setColor(new Color(205,240,247));  //blue
  	c.fillRect(0, 0, 680, 400);
  	c.setColor(Color.red);
  	c.fillRect(200,280,280, 90);
  	c.setColor(Color.yellow);
  	c.fillOval(500, 70, 90, 90);
  	c.setColor(new Color(38,82,23));   //green
  	c.fillRect(0,400,680, 350);
  	c.setColor(Color.black);
  	c.fillOval(410, 350, 50, 50);
  	c.setColor(Color.black);
  	c.fillOval(220, 350, 50, 50);
  	c.setColor(Color.black);
  	c.drawLine(70,200,200,280); 	 
 	 
 	 
	}
    
}



