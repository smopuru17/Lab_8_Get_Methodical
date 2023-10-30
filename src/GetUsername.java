import java.util.Scanner;


public class GetUsername {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String firstname = "";
        String lastname = "";
        firstname = SafeInput.getNonZeroLenString(in, "Enter your firstname");
        lastname = SafeInput.getNonZeroLenString(in, "Enter your lastname");
        System.out.println("Your full name is " + firstname + "" + lastname + ".");
    }

}