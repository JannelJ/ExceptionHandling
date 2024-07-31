package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {


    public static int[] getUserInput() {


        Scanner input = new Scanner(System.in);
        int[] result = new int[2];
        int a;
        int b;

        while(true) {
            try {
                System.out.println("Enter divisor: ");
                a = input.nextInt();
                result[0] = a;

                System.out.println("Enter dividend: ");
                b = input.nextInt();
                result[1] = b;

            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please try again.");
                input.next();
            }
            return result;
        }

    }

}