import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get Social Security Number
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", ssnPattern);
        System.out.println("Your SSN is: " + ssn);

        // Get UC Student M number
        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (MXXXXX)", mNumberPattern);
        System.out.println("Your M number is: " + mNumber);

        // Get menu choice
        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O/S/V/Q)", menuPattern);
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
