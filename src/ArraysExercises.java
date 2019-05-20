import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person human0 = new Person("Bob");
        Person human1 = new Person("Sheila");
        Person human2 = new Person("Walter");


        Person[] names = {human0,human1,human2};

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i].getName());
        }
    }

}
