import java.util.Scanner;

public class SafeInput {

    public static int getInt(Scanner pipe, String prompt) {
        int x;
        String trash = "";
        do{
            System.out.print( prompt + ": ");
            x = pipe.nextInt();
            if(pipe.hasNext()) {
                trash = pipe.nextLine();
                System.out.println("You Entered " + trash + " not a number ");
                System.out.println("Run the program again with correct input. ");

            }
    } while(x != (int)x);

        return Integer.parseInt(String.valueOf(x));
    }




    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static void PrettyHeader(Scanner pipe, String prompt) {
        String retVal = "";
        final int HEADER_WIDTH = 54;
        int msgLength = 0;
        int remainder = 0;
        int before = 0;
        int after = 0;
        System.out.println(prompt + ": ");
        retVal = pipe.nextLine();
        msgLength = retVal.length();
        if (msgLength > HEADER_WIDTH) {
            System.out.println("Failed to create header, msg is too long!");
            return;
        } else {
            remainder = HEADER_WIDTH - msgLength;
            if (remainder % 2 == 0) {
                before = remainder / 2;
                after = remainder / 2;
            } else {
                before = remainder / 2;
                after = remainder / 2 + 1;
            }
            for (int row = 0; row < 60; row++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("***");
            for (int row = 0; row < before; row++) {
                System.out.print(" ");
            }
            System.out.print(retVal);
            for (int row = 0; row < after; row++) {
                System.out.print(" ");
            }
            System.out.print("***");
            System.out.println();
            for (int row = 0; row < 60; row++) {
                System.out.print("*");
            }
        }
    }

}

