import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        while (true == true) {

            Scanner scan = new Scanner(System.in);
            String YouType = scan.nextLine();
            if (YouType.contains("!")) {
                System.out.println("Whoa, chill out!");
            } else if (YouType.contains("?")) {
                System.out.println("Sure.");
            } else if (YouType.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}
