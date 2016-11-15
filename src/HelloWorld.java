/**
 * Created by Austin on 11/11/16.
 */

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        int width;
        int length;
        String userInput;

        System.out.println("Welcome to the room Calculator.");

        do {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter width: ");
            width = sc.nextInt();
            System.out.print("Enter the Length: ");
            length = sc.nextInt();

            System.out.println("The room has a parameter of " + perimeter(width, length));
            System.out.println("The area is " + area(width, length));

            System.out.print("Do you want to calculate another room? (yes/on)");
            userInput = sc.next();

        } while (userInput.equals("yes"));

        System.out.println("Thank you for using the room Calculator.");
    }

    public static int perimeter(int width, int height) {
     return 2 * width + 2 * height;
    }

    public static int area (int width, int height) {
     return width * height;
    }

}

