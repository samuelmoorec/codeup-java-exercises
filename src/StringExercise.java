import java.util.Scanner;
public class StringExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = "We don't need no education";
        message = message.replace("education","thought control");
        message = "Check \"this\" out!, \"s inside of \"s!";
        message = "In windows, the main drive is usually C:\\";
        message = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(message);


    }
}
