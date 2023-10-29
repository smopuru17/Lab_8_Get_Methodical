
import java.util.Scanner;


public class FavNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int favoriteInt = 0;
        double favoriteDou = 0;

        favoriteInt = SafeInput.getInt(in, "Enter your favorite integer");
        favoriteDou = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("You said your favorite integer is " + favoriteInt + " and your favorite double is " + favoriteDou);




    }

}