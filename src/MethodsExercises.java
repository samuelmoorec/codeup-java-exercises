import java.text.Format;
import java.util.Scanner;
public class MethodsExercises {

    public static int add(int num1,int num2){
        return num1 + num2;
    }
    public static int sub(int num1,int num2){
        return num1 - num2;
    }
    public static int multiply(int num1,int num2){
        return num1 * num2;
    }
    public static int divide(int num1,int num2){
        return num1 / num2;
    }
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        while (!(min <= userNumber && userNumber <= max)){
            System.out.print("Enter a number between 1 and 10: ");
            userNumber = scan.nextInt();
        }
          return userNumber;
    }

    public static void Continue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String userInput = scan.nextLine();
        while (!(userInput.contains("y") || userInput.contains("n"))){
            System.out.println("Would you like to continue?");
            userInput = scan.nextLine();
        }
        if (userInput.contains("y")){
            System.out.println("You will Continue");
        }else{
            System.out.println("Exiting...");
            System.exit(0);
        }

    }

    public static void factors(int Number) {

        int number = Number;
        System.out.print(number + "! ");
        for(int i = 1; i <= number; ++i) {

            if (number % i == number) {
                System.out.print(i);
            }else if (number % i == 0){
                System.out.print(i + "x");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(add(1,6));
        System.out.println(sub(1,6));
        System.out.println(multiply(4,6));
        System.out.println(divide(36,6));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        Continue();
        factors(userInput);



    }
}
