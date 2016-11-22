/**
 * Created by Austin on 11/21/16.
 */

//import java.util.Arrays;
import java.util.Scanner;

public class BattingAverage {

    public static void main(String[] args) {
        int totalAtBats;
        double totalHits;
        double totalBasesEarned;
        double battingAverage;
        double sluggingPercentage;
        String userInput;
        int[] battingRecord;


        System.out.println("Welcome to the Batting Average Calculator. ");
        Scanner sc = new Scanner(System.in);

        do {
            totalHits = 0;
            totalBasesEarned = 0;

            System.out.print("\nEnter the player's number of at-bats? ");
            totalAtBats = sc.nextInt();
            battingRecord = new int[totalAtBats];

            for (int i = 1; i < battingRecord.length + 1; i++) {
                System.out.print("How many bases did the batter get at-bat #" + i + " ");
                battingRecord[i - 1] = sc.nextInt();
                totalBasesEarned += battingRecord[i - 1];
                if (battingRecord[i - 1] >= 1 ) {
                    totalHits += 1;
                }
            }
            sluggingPercentage = totalBasesEarned / battingRecord.length;
            battingAverage = totalHits / battingRecord.length;
//        System.out.println(Arrays.toString(battingRecord));
            System.out.println("\nThe Batting average is " + battingAverage + " and the Slugging Percentage is " + sluggingPercentage);

            System.out.print("Do you want to calculate to Batting average of another player? (y/n) ");
            userInput = sc.next();

        } while (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));

        sc.close();
        System.out.println("\nThank you for using the Batting Average Calculator.");
    }
}
