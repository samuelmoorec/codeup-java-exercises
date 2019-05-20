package movies;
import java.util.Scanner;
public class MoviesApplication {

    public static boolean genreSelection(String[] arry,String valueToCheckFor){
        for(int i = 0;i < arry.length;i++){
            if (arry[i].equals(valueToCheckFor)){
                return true;
            }
        }
        return false;
    }

    public static boolean Continue(){
        Scanner scan = new Scanner(System.in);
        String userConfirm = scan.nextLine().trim().toLowerCase();
        if (userConfirm.contains("y")) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPlease Select a Genre of movies \nyou would like to view :\n\n[all]\n[drama]\n[musical]\n[scifi]\n[horror]\n[animated]\n[comedy]\n[exit]\n");
        String userInput = scan.nextLine().toLowerCase();
        while (!userInput.equals("exit")) {
            String[] genreSelectionArry = {"all","drama", "musical", "scifi", "horror", "animated", "comedy"};
            while (!genreSelection(genreSelectionArry, userInput)) {
                System.out.print("\nPlease Select a Genre :\n\n[all]\n[drama]\n[musical]\n[scifi]\n[horror]\n[animated]\n[comedy]\n[exit]\n");
                userInput = scan.nextLine().trim().toLowerCase();
            }
            System.out.println("Here is your movie selection :");
            String MovieList = "";
            for (Movie i : MoviesArray.findAll()) {
                if (i.getCategory().equals(userInput) || userInput.equals("all")) {
                    MovieList += i.getName() + " -- " + i.getCategory() + "\n";
                }
            }
            System.out.print(MovieList);
            System.out.println("continue?");
            if (Continue()){
                userInput = "";
            }else{
                userInput = "exit";
            }
        }
    }
}
