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

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Students first name? :");
        firstName = sc.next();

        System.out.println("Students last name? :");
        lastName = sc.next();
        
        System.out.println("Students score? :");
        score = sc.nextInt();

        Student newStudent = new Student(firstName, lastName, score);

        students.add(newStudent);

    }
}
