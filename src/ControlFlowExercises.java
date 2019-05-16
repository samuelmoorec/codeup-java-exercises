import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 5;
        while (i <= 15){
            System.out.println(i);
            i++;
        }


        long n = 2;
        do {
            System.out.println(n);
            n = n * n;
        }while(n <= 65536);


        int fb = 1;
        while (fb <= 100){
            if (fb%15==0){
                System.out.println("FizzBuzz");
            }else if (fb%3==0){
                System.out.println("Fizz");
            }else if (fb%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(fb);
            }
            fb++;
        }

        System.out.println("Give me number to calculate area and volume with");
        int userint = scan.nextInt();
        for (int b = 0; b <= userint; b++){
            if (b == 0){
                System.out.printf(" ________________________ \n|%-8s|%-6s|%-8s|\n|--------|------|--------|\n","Number","Aea","Volume");
            }else if (b == userint){
                System.out.printf("|%-8s|%-6s|%-8s|\n|________|______|________|\n",b,b*b,b*b*b);
            }else{
                System.out.printf("|%-8s|%-6s|%-8s|\n",b,b*b,b*b*b);}
        }

        System.out.println("What is your grade?");
        int grade = scan.nextInt();
        String Grade;
        if (88 <= grade && grade <= 100){
           Grade = "A";
        }else if (80 <= grade && grade <= 87){
           Grade = "B";
        }else if (67 <= grade && grade <= 79){
            Grade = "C";
        }else if (60 <= grade && grade <= 66){
            Grade = "D";
        }else {
            Grade = "F";
        }
        System.out.printf("You got an %s on your Assigment",Grade);

    }
}
