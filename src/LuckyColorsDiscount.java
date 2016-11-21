/**
 * Created by Austin on 11/21/16.
 */

import java.util.Scanner;

public class LuckyColorsDiscount {

    public enum LuckyColors {
        RED(.0), BLUE(.10), YELLOW(.25), GREEN(.35), PURPLE(.50), PINK(.100);

        public final double discountPercent;

        LuckyColors(double discountPercent) {
            this.discountPercent = discountPercent;
        }

        public double getDiscountAmount(double saleTotal) {
            return saleTotal - (discountPercent * saleTotal);
        }
    }

    public static void main(String[] args) {
        double saleTotal;

        Scanner sc = new Scanner(System.in);
        System.out.print("What is you total for sale? $");
        saleTotal = sc.nextDouble();

        LuckyColors color = getRandomDiscount();

        System.out.println("The color you got is: " + color);
        System.out.println("Your new discounted total is $" + color.getDiscountAmount(saleTotal));

        sc.close(); // Closes Scanner
    }

    public static LuckyColors getRandomDiscount() {
        int randomNumber = (int) Math.ceil(Math.random() * 6);

        switch (randomNumber) {
            case 0:
                return LuckyColors.RED;
            case 1:
                return LuckyColors.BLUE;
            case 2:
                return LuckyColors.YELLOW;
            case 3:
                return LuckyColors.GREEN;
            case 4:
                return LuckyColors.PURPLE;
            default:
                return LuckyColors.PINK;
        }
    }


}




