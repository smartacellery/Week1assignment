
import hsa.Console;
import java.awt.Color;

public class BarGraphEx1 {

    public static void main(String[] args) {
        Console c = new Console();

        int h1, h2, h3, h4;
        while (true) {
            c.print("Enter height of bar 1 > ");
            h1 = c.readInt();
            if (h1 >= 50 && h1 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 1 betweet 50 and 450!\n");
            }
        }

        //first bar
        c.setColor(Color.yellow);
        c.fillRect(100, 500 - h1, 50, h1);
        c.setColor(Color.black);
        c.drawString("Value : " + h1, 100, 500 - h1 - 20);

        while (true) {
            c.print("Enter height of bar 2 > ");
            h2 = c.readInt();
            if (h2 >= 50 && h2 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 2 betweet 50 and 450!\n");
            }
        }

        //second bar
        c.setColor(Color.red);
        c.fillRect(200, 500 - h2, 50, h2);
        c.setColor(Color.black);
        c.drawString("Value : " + h2, 200, 500 - h2 - 20);

        while (true) {
            c.print("Enter height of bar 3 > ");
            h3 = c.readInt();
            if (h3 >= 50 && h3 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 3 betweet 50 and 450 please!\n");
            }
        }

        //first bar
        c.setColor(Color.orange);
        c.fillRect(300, 500 - h3, 50, h3);
        c.setColor(Color.black);
        c.drawString("Value : " + h3, 300, 500 - h3 - 20);

        while (true) {
            c.print("Enter height of bar 4 > ");
            h4 = c.readInt();
            if (h4 >= 50 && h4 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 4 betweet 50 and 450 please!\n");
            }
        }

        //first bar
        c.setColor(Color.blue);
        c.fillRect(400, 500 - h1, 50, h1);
        c.setColor(Color.black);
        c.drawString("Value : " + h4, 400, 500 - h4 - 20);

    }

}
