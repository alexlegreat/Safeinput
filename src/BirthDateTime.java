import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get year
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Get month
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Get day based on month
        int day = 0;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
            case 2: // February
                // Determine if it's a leap year for February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                } else {
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 28);
                }
                break;
        }

        // Get hour and minute
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);

        // Display the birth date and time
        System.out.println("Your birth date and time is: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);
    }
}
