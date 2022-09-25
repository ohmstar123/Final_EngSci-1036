import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Declare the array
        int[] array = new int[10];

        //Declare a random number generator
        Random randGen = new Random();

        //Input a random number into each index of the array
        for (int i = 0; i < array.length; i++) {
            array[i] = randGen.nextInt(100) + 1;
        }

        //Print out the array
        System.out.println("The array elements are: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Locate the largest number in the array and print it afterwards
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]){
                temp = array[i];
            }
        }

        System.out.println("\nThe largest number is: " + temp);
    }
}
