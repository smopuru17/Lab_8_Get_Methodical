import java.util.Scanner;


public class DevTest
{


    public static Scanner test = new Scanner(System.in);
    public static void main(String[] args)
    {
    String firstName = "";
    firstName = getNonZeroLenString(test, "Enter your firstname");
    System.out.println("Name is: " + firstName);

    String lastName = "";
    lastName = getNonZeroLenString(test, "Enter your lastname");
    System.out.println("Name is: " + lastName);

    int age = getInt(test,"Enter your age");
    System.out.println("Age is " + age);

    double salary = getDouble(test, "Enter your salary: ");
    System.out.println("Salary is " + salary);

    int favNum = getRangedInt(test, "Enter your fav Num", 1, 10);
    }


    /**
     * Returns a String from the user that has at least one character
     * Blocks and repeats until the input is correct
     * @param pipe Scanner to use to read the string
     * @param prompt String that tells the user what to input
     * @return String obtained from the user that is of at least length 1
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do {
            //display the prompt
            System.out.print(prompt + ": ");
            //get the input
            response = pipe.nextLine();
            //check if it valid and end the loop if it is
            if (response.length() > 0)
            {
            done = true;
            }
            else
            {
                System.out.println("\nYou must enter at least one character!\n");
            }

        }while(!done);

        return response;
    }



    public static int getInt(Scanner pipe, String prompt)
    {
        String trash = "";
        boolean done = false;
        int val = 0;
        do {
            //display the prompt
            System.out.print(prompt + ": ");
            //get the input
            if(pipe.hasNextInt())
            {
                val = pipe.nextInt(); //clear the buffer
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else // dont have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + "you must enter a valid int!\n");
            }

        }while(!done);

return val;

    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        /**
         * Returns a String from the user that has at least one character
         * Blocks and repeats until the input is correct
         * @param pipe Scanner to use to get double
         * @param prompt String that tells the user what to input
         * @return String obtained from the user that is of at least length 1
         */
    String trash = "";
    boolean done = false;
    double val = 0;
    do {
        //display the prompt
        System.out.print(prompt + ": ");
        //get the input
        if(pipe.hasNextDouble())
        {
            val = pipe.nextDouble(); //clear the buffer
            pipe.nextLine(); // clear buffer
            done = true;
        }
        else // dont have an int
        {
            trash = pipe.nextLine();
            System.out.println("\nYou entered: " + trash + "you must enter a valid int!\n");
        }

    }while(!done);

    return val;
}
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        /**
         * Returns a String from the user that has at least one character
         * Blocks and repeats until the input is correct
         * @param pipe Scanner to use for input
         * @param prompt msg that tells the user what to input
         * @param low low boundary for inclusive range
         * @param high high boundary for inclusive range
         * @return no constraints on range
         */
        String trash = "";
        boolean done = false;
        int val = 0;
        do {
            //display the prompt
            System.out.print(prompt + " [" + low + " - " + high + "] ");
            //get the input
            if(pipe.hasNextInt())
            {
                val = pipe.nextInt(); //clear the buffer
                pipe.nextLine(); // clear buffer

                if(val >= low && val <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("" + val + " is not in the range [" + low + " - " + high + "] ");
                }
            }
            else // dont have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + "you must enter a valid int!\n");
            }

        }while(!done);

        return val;

    }





    public static double getRangedDouble(Scanner pipe, String prompt, int low, int high)
    {
        String trash = "";
        boolean done = false;
        int val = 0;
        do {
            //display the prompt
            System.out.print(prompt + ": ");
            //get the input
            if(pipe.hasNextInt())
            {
                val = pipe.nextInt(); //clear the buffer
                pipe.nextLine(); // clear buffer

                if(val >= low && val <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("" + val + " is not in the range [" + low + " - " + high + "] ");
                }
            }
            else // dont have an int
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered: " + trash + "you must enter a valid int!\n");
            }

        }while(!done);

        return val;

    }
}
