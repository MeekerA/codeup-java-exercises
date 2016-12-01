
/**
 * Created by Austin on 12/1/16.
 */

import java.util.Scanner;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        int startNumber;
        int endNumber;

        System.out.println("Welcome to the FizzBuzz App");

        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to start at? :");
        startNumber = sc.nextInt();
        System.out.print("What is your ending number? :");
        endNumber = sc.nextInt();
        sc.close();
        doFizzBuzz(startNumber, endNumber);
    }

    public static void doFizzBuzz(int startNumber, int endNumber) {

        for (int i = startNumber; i <= endNumber; i++) {

            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }
}
