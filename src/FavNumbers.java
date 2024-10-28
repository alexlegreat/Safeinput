import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favoriteInt = SafeInput.getInt("Enter your favorite integer", in);

        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double");


        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}

