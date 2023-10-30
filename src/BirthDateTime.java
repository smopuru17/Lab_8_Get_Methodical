import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int y = 0;
        int m = 0;
        int d = 0;
        int h = 0;
        int min = 0;
        m = SafeInput.getRangedInt(in, "Enter your birth month",1,12);
        y = SafeInput.getRangedInt(in, "Enter your birth year",1900,2020);
        if(m == 1)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }
        else if(m == 2)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,28);
        }

        else if(m == 3)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }

        else if(m == 4)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,30);
        }

        else if(m == 5)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }

        else if(m == 6)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,30);
        }

        else if(m == 7)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }

        else if(m == 8)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }

        else if(m == 9)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,30);
        }

        else if(m == 10)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }

        else if(m == 11)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,30);
        }
        else if(m == 12)
        {
            d = SafeInput.getRangedInt(in, "Enter your birth day",1,31);
        }
        h = SafeInput.getRangedInt(in, "Enter your hour of birth",00,24);
        min = SafeInput.getRangedInt(in, "Enter your minute of birth",00,60);

        System.out.println("\nYou were born on "+ m + "/6" + d + " at " + h + ":" + min + " in " +y);

    }

}