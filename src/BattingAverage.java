/**
 * Created by Austin on 11/21/16.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BattingAverage {

    public static void main(String[] args) {
        int battingNumber;
        double sum;
        double battingAverage;
        String userInput;


        System.out.println("Welcome to the Batting Average Calculator.");

        do {
            sum = 0;
            battingAverage = 0;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the player's number of at-bats? ");
            battingNumber = sc.nextInt();
            int[] battingRecord = new int[battingNumber];

            for (int i = 1; i < battingRecord.length + 1; i++) {
                System.out.print("How many bases did the batter get at-bat #" + i + " ");
                battingRecord[i - 1] = sc.nextInt();
                sum += battingRecord[i - 1];
            }
            battingAverage = sum / battingRecord.length;
//        System.out.println(Arrays.toString(battingRecord));
            System.out.println("The batting average is " + battingAverage);

            System.out.print("Do you want to calculate to Batting average of another player? (y/n) ");
            userInput = sc.next();
            sc.close();

        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the Batting Average Calculator.");

    }

}
