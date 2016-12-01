/**
 * Created by Austin on 11/28/16.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordApp {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        int score;
        String userInput;

        Scanner sc = new Scanner(System.in);

        do {

            ArrayList<Student> students = new ArrayList<>();

            System.out.println("Students first name? :");
            firstName = sc.next();

            System.out.println("Students last name? :");
            lastName = sc.next();

            System.out.println("Students score? :");
            score = sc.nextInt();

            Student newStudent = new Student(firstName, lastName, score);
            students.add(newStudent);

            System.out.println("Would you like to ad another student (y/n) :");
            userInput = sc.next();

        } while (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));

//        for(Student student : students) {
//            System.out.println(student.lastName + " " + student.firstName + " " + student.score);
//        }
    }
}
