/**
 * Created by Austin on 11/14/16.
 */

import java.util.Scanner;

public class Methods {

    // ----------- Methods exercise #3 --------------

    public static void main(String[] args) {
        String changeMe = "hello codeup!";
        changeString(changeMe); // won't change the string
        System.out.println(changeMe);
    }
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
        System.out.println(s);
    }


    // ------------ Methods exercise #2 --------------

//    public static void main(String[] args) {
//
//        int userinput;
//        long factorialStart;
//        String runFactorialCal;
//
//        System.out.println("Welcome to the Factorial Calculator!");
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter an integer form 1 to 20: ");
//            userinput = sc.nextInt();
//
//            if (userinput <= 0 || userinput > 20) {
//                System.out.println("Please enter a number from 1 to 20.");
//
//            } else {
//                System.out.print(userinput + "! = ");
//                factorialStart = 1L;
//
//                for (int i = 1; i <= userinput; i++) {
//                    factorialStart = factorialStart * i;
//                    System.out.print(i);
//
//                    if (i != userinput) {
//                        System.out.print(" x ");
//                    }
//                }
//                System.out.println(" = " + factorialStart);
//            }
//            System.out.print("Do you want to calculate another Factorial? (y/n): ");
//            runFactorialCal = sc.next();
//
//        } while (runFactorialCal.equalsIgnoreCase("y"));
//        System.out.println("Thank you for using the Factorial Calculator!");

//    }

    // --------------- Declared Methods for exercise #1 -----------------

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulas(int a, int b) {
        return a % b;
    }


}
