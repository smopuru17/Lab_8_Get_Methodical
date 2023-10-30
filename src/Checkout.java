import java.sql.SQLOutput;
import java.util.Scanner;


public class Checkout {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double price = 0;
        double totalPrice = 0;
        boolean done = true;

    do
    {
    price = SafeInput.getRangedDouble(in,"Please enter the cost", .50,10);
    totalPrice = totalPrice + price;
    done = SafeInput.getYNConfirm(in, "Anything else? [Y,N]");
    } while(done);

System.out.println("Your total price is " + totalPrice);

    }

}