import java.util.Scanner;
import java.lang.String;

public class PrettyHeaders {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String msg;
        System.out.println("Enter your message:");
        msg=in.nextLine();
        PrettyHeaders.prettyHeaders(msg);

    }


    public static void prettyHeaders(String msg) {
        System.out.println("*****************************************************************");
        System.out.println("***                        " + msg + "                               ***");
        System.out.println("*****************************************************************");


    }

}