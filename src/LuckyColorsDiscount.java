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

        public double getDiscountAmount(double saleTotal){
            return saleTotal - (discountPercent * saleTotal) ;
        }
    }

    public static void main(String[] args) {
        double saleTotal;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is you total for sale? $");
        saleTotal = sc.nextDouble();
        System.out.println("Your new discounted total is $" + LuckyColors.PURPLE.getDiscountAmount(saleTotal));
    }

}
