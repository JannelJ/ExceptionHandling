package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {


    public static int[] getUserInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter divisor: ");
        int a = input.nextInt();

        System.out.println("Enter dividend: ");
        int b;

        try {
            b = input.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
        }

        while (input.hasNextInt()) {

        }
        return result;
    }

}