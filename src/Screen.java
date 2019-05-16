import java.util.Scanner;


public class Screen {

    public static String Screen(int ScreenWidth, int ScreenHeight,int[] X_Array,int[] Y_Array){
        int wide = ScreenWidth;
        int height = ScreenHeight;
        int[] positionX = X_Array;
        int[] positionY = Y_Array;
        String ScreenOutput = "";


        for (int y = 1; y < height + 1; y++) {
            if (y == 1) {
                ScreenOutput += ("+");
                for (int xborder = 1; xborder < wide + 1; xborder++) {
                    ScreenOutput += ("--");
                }
                ScreenOutput += ("+\n");
            }

            for (int x = 1; x < wide + 1; x++) {
                if (x == 1) {
                    ScreenOutput += ("|");
                }
                int ran = 0;
                ran = 0;

                for (int arry = 0; arry < positionX.length; arry++) {

                    if (x == positionX[arry] && y == positionY[arry]) {
                        ScreenOutput += ("██");
                        ran = 1;
                    }
                }
                if (ran == 0) {
                    ScreenOutput += ("░░");
                }


                if (x == wide) {
                    ScreenOutput += ("|\n");
                }
            }


            if (y == height) {
                ScreenOutput += ("+");
                for (int xborder = 1; xborder < wide + 1; xborder++) {
                    ScreenOutput += ("--");
                }
                ScreenOutput += ("+\n");
            }
        }
        return ScreenOutput;
    }








    public static void main(String[] args) {

        int x[] = {2,2,2,2,2,3,4,5,6,6,6,6,6,8,8,8,8,8,9,9,9,10,10,10,11,11,13,13,13,13,13,14,15,17,17,17,17,17,18,19,21,21,21,22,22,23,23,24,24,24};
        int y[] = {2,3,4,5,6,4,4,4,2,3,4,5,6,2,3,4,5,6,2,4,6, 2, 4, 6, 2, 6, 2, 3, 4, 5, 6, 6, 6, 2, 3, 4, 5, 6, 6, 6, 3, 4, 5, 2, 6, 2, 6, 3, 4, 5};


        while (true == true) {
            Scanner scan = new Scanner(System.in);
            System.out.printf(Screen(30, 20,x,y));
            String key = scan.next();
            if (key.equals("s")){
                y[0] += 1;
            }
        }
    }
}
