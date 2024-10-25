import java.util.Scanner;
public class DevTest
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  int x ;
  x = SafeInput.getInt(in, "Enter a number");
  System.out.println("Your number is: " + x );
 }
}


