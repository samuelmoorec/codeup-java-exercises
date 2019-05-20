import java.lang.reflect.Array;
import java.util.Random;


public class ServerNameGenerator {
    public String[] adj = {"bold","big","round","sassy","silly","sad","happy","salty","silky","hairy"};

    public String[] noun = {"tower","car","bee","crab","tree","robot","phone","bottle","whiskey","plane"};


    public static int randomElement (String[] array){
        Random ran = new Random();
        return ran.nextInt(array.length);
    }

    public static String randomName (String[] adjective,String[] noun){
        String adj = adjective[randomElement(adjective)];
        String nou = noun[randomElement(noun)];
        return adj + "-" + nou;
    }

    public static void main(String[] args) {

        String[] adj = {"bold","big","round","sassy","silly","sad","happy","salty","silky","hairy"};

        String[] noun = {"tower","car","bee","crab","tree","robot","phone","bottle","whiskey","plane"};

        System.out.println(randomName(adj,noun));
    }

}