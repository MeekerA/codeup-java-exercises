/**
 * Created by Austin on 11/18/16.
 */

import java.util.Scanner;

public class PingPongGame {

    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;

         Scanner input = new Scanner(System.in);

        do {
            System.out.println("What side of the table would you like to play? (left or right)");

            String side = input.next();
            long randomNumber = Math.round(Math.random());

            long sideNumber = "left".equalsIgnoreCase(side) ? 0 : 1;

            // playerScore += (randomNumber == sideNumber) ? 1 : 0; --------- same as below ---------
            if (randomNumber == sideNumber){
                playerScore++;
            }

            randomNumber = Math.round(Math.random());

            System.out.println("What side of the table ");




        } while (playerScore < 7 && computerScore < 7);



    }

}
