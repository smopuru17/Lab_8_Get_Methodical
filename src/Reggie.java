import java.util.Scanner;


public class Reggie
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCNUMBER = "";
        String menu = "";

       SSN = SafeInput.getRegExString(in,"Enter you SSN number", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);
       UCNUMBER = SafeInput.getRegExString(in,"Enter you UC M number", "(M|m)\\d{5}");
        System.out.println("Your UC Number is " + UCNUMBER);
       menu = SafeInput.getRegExString(in,"Open, Save, View, Quit", "[OoSsVvQq]");

       if(menu.equalsIgnoreCase("O"))
       {
           System.out.println("Opening...");
       }

       else if (menu.equalsIgnoreCase("Q"))
       {
            System.out.println("Quitting...");
       }
       else if (menu.equalsIgnoreCase("S") )
       {
           System.out.println("Saving...");
       }

       else
       {
           System.out.println("Viewing...");
       }
    }

}
