import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        double pi = 3.14159;

        System.out.printf("The value of pi is appoxamently " + "%.2f" + "\n",pi);

        String Greeting = "Hello";
        System.out.println(Greeting);
        System.out.println("What is your Name ?");
        String userName = scanner.next();
        System.out.printf("%s %s \n",Greeting,userName);
        System.out.printf("What is your favorite number %s?\n",userName);
        int favNumber = scanner.nextInt();
        System.out.printf("%s is a Stupid favorite number\n",favNumber);
        System.out.println("Give me a word to remember");
        String firstWord = scanner.next();
        System.out.println("Give me a second word to remember");
        String secondWord = scanner.next();
        System.out.println("Give me a third word to remember");
        String thirdWord = scanner.next();
        System.out.printf("Your Three words are %s, %s, and %s\n",firstWord,secondWord,thirdWord);
        System.out.println("Give me a sentence");
        String userSent = scanner.next();
        System.out.printf("Here is your sentence\"%s\"\n",userSent);
        System.out.println("Give me the length of your class room");
        int roomLength = scanner.nextInt();
        System.out.println("Now the width plz");
        int roomWidth = scanner.nextInt();
        int roomPerimeter = roomLength * 2 + roomWidth * 2;
        int roomArea = roomLength * roomWidth;
        System.out.printf("Perimeter: %s\nArea: %s\n",roomPerimeter,roomArea);

    }

}
