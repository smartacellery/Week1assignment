
import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double baseprice = 1.50;
        double costutility = 0.75;
        double toppingcost = 0.75;
        double baseingredients = 0.50;
        int pizzasize;
        int numtoppings;
        double totcost;
        System.out.println("Enter the size of the pizza that you would like in inches > ");
        pizzasize = scan.nextInt(); //returns an int   
        System.out.println("Enter the number of toppings that you would like on the pizza > ");
        numtoppings = scan.nextInt(); //returns an int      
        totcost = baseprice + costutility + (toppingcost * numtoppings) + (baseingredients * pizzasize);
        System.out.format("The total cost of the pizza is %.2f $ \n ", totcost);
    }

}
