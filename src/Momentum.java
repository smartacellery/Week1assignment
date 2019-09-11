
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass; double vel; double momentum;
        System.out.println("Enter a number for the mass of the object > ");
        mass = scan.nextDouble(); //returns a double   
        System.out.println("Enter a number for the velocity of the object > ");
        vel = scan.nextDouble(); //returns a double       
        momentum=mass*vel;
        System.out.format("The momentum of the object is %.2f\n", momentum);
        
    }

}
