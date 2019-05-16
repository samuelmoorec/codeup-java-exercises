import java.util.Random;
import java.util.Scanner;
public class heroGame {


    public static double DifficultyMultiplier(double Health){
        Scanner scan = new Scanner(System.in);
        String response = "";
        double Difficulty = 1;
        while (response.equals("")){
            System.out.println("Choose game difficulty would you like to play?\n[Easy]\n[Normal]\n[Hard]");
            response = scan.nextLine();
            if (response.contains("E") || response.contains("e")) {
                System.out.println("You have set difficulty to Easy");
                Difficulty = 2;
            } else if (response.contains("N") || response.contains("n")) {
                System.out.println("You have set difficulty to Normal");
                Difficulty = 1;
            } else if (response.contains("H") || response.contains("h")) {
                System.out.println("This difficulty is only meant for the experienced players\nAre you sure you want to continue?\n[Yes]\n[No]");
                String confirmation = scan.nextLine();
                if (confirmation.contains("Y") || confirmation.contains("y")) {
                    System.out.println("You have set difficulty to Hard");
                    Difficulty = 0.5;
                } else {
                    response = "";
                }
            }else{
                response = "";
            }
        }
        return Health * Difficulty;
    }



    public static void main(String[] args) {

        int health = 100;

        System.out.println(DifficultyMultiplier(health));


//        int Depressed_Slime = new Random().nextInt((10 - 8)+1)+8 * difficulty;
//        int Happy_Slime = new Random().nextInt((15-10)+1)+10 * difficulty;
//        int Soilder = new Random().nextInt((50-35)+1)+35 * difficulty;
//        int usersHealth = new Random().nextInt((100-80)+1)+80;
//        int ButtHurt_Soilder = new Random().nextInt((40-30)+1)+30;
//        int Boulder_Guy = new Random().nextInt((80-60)+1)+60;
//        String UserName = "";
//        while (UserName.equals("")) {
//            System.out.println("So Knight what name do you go buy?");
//            UserName = scan.next();
//        }
//        int Gender = 0;
//        if (UserName.equals("Reek")){
//            Gender = 4;
//            System.out.println("You have immunity to crotch attacks");
//        }
//        if (UserName.equals("daenerys")){
//            Gender = 1;
//            System.out.println("You have immunity to fire");
//        }
//        while (Gender == 0) {
//            System.out.printf("%s...\nAnd what gender is %s?\n1 - Female\n2 - Male\n3 - None of your damn business\n",UserName,UserName);
//            Gender = scan.nextInt();
//            if (Gender == 1){
//                System.out.println("You have selected Female");
//            }else if (Gender == 2){
//                System.out.println("You have selected Male");
//            }else if (Gender == 3){
//                System.out.println("You have selected None of your damn business");
//            }else{
//                Gender = 0;
//            }
//        }
//
//        String Weapon = "None";
//        while(Weapon.equals("None")){
//            System.out.printf("What is your weapon of choice %s?\n1 - Sword\n2 - Axe\n3 - Bow&Arrow\n4 - Hammer\n5 - Rusty_Spoon\n6 - Old_Shovel\n",UserName);
//            String choice = scan.nextLine();
//            if (choice.equals("1")){
//                Weapon = "Sword";
//            }else if (choice.equals("2")){
//                Weapon = "Axe";
//            }else if (choice.equals("3")){
//                Weapon = "Bow&Arrow";
//            }else if (choice.equals("4")){
//                Weapon = "Hammer";
//            }else if (choice.equals("5")){
//                Weapon = "Rusty_Spoon";
//            }else if (choice.equals("6")){
//                Weapon = "Old_Shovel";
//            }else{
//                Weapon = "None";
//            }
//        }
//        System.out.printf("You have chosen a %s as your weapon\n",Weapon);
//        int AmountOfLight = 2;
//        int NumberOfArms = 2;
//        int NumberofLegs = 2;
//        int NumberofFeet = 2;
//
//        System.out.println("You see 2 passage ways\none with a red light at the end \nand the other a dark passage with no light at all\n1 - Go down passage with Red Light\n2 - Go down dark passage with No Light");
//        if (scan.next().equals("1")){
//            System.out.println("As you walk down the passage the red light you find a lit tourch");
//        }else if (scan.next().equals("2")){
//            System.out.println("You walk down the dark abbis of a passage way to step into a sticky substance\n1 - Quickly Move foot out of slime\n2 - Keep you foot in the sticky substance");
//            if(scan.next().equals("1")){
//                System.out.println("You quickly remove your foot to find a depressed slime covering the floor up ahead");
//            }else{
//                System.out.println("you foot has melted off");
//                NumberofFeet -= 1;
//                usersHealth -= 20 * difficulty;
//
//            }
//        }
//
//            new Random().nextInt(100);
    }}
