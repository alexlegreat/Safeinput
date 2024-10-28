import java.util.Scanner;
public class DevTest {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String result = SafeInput.getRegExString(in, "Enter a string containing only letters", "[a-zA-Z]+");
  System.out.println("Your input: " + result);
 }


}





