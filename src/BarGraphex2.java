
import hsa.Console;
import java.awt.Color;

public class BarGraphex2 {

    public static void main(String[] args) {
        Console c = new Console();
        int h1, h2, h3, h4;

        Barclass b1 = new Barclass();
        Barclass b2 = new Barclass();
        Barclass b3 = new Barclass();
        Barclass b4 = new Barclass();

        while (true) {
            c.print("Enter height of bar 1 > ");
            h1 = c.readInt();
            if (h1 >= 50 && h1 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 1 betweet 50 and 450!\n");
            }
        }

        while (true) {
            c.print("Enter height of bar 2 > ");
            h2 = c.readInt();
            if (h2 >= 50 && h2 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 2 betweet 50 and 450!\n");
            }
        }

        while (true) {
            c.print("Enter height of bar 1 > ");
            h3 = c.readInt();
            if (h3 >= 50 && h3 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 3 betweet 50 and 450!\n");
            }
        }

        while (true) {
            c.print("Enter height of bar 1 > ");
            h4 = c.readInt();
            if (h4 >= 50 && h4 <= 450) {
                break;
            } else {
                c.print("Enter a valid number for bar 4 betweet 50 and 450!\n");
            }
        }

        b1.xloc = 200;
        b1.height = h1;
        b1.col = Color.red;

        b2.xloc = 300;
        b2.height = h2;
        b2.col = Color.yellow;

        b3.xloc = 400;
        b3.height = h3;
        b3.col = Color.green;

        b4.xloc = 500;
        b4.height = h4;
        b4.col = Color.blue;

        //draw the bars
        b1.draw(c);
        b2.draw(c);
        b3.draw(c);
        b4.draw(c);
    }

}
