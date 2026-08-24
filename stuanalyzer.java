
import java.util.Scanner;
public class stuanalyzer{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;

        
        int average = total / 3;


        boolean passed = sub1 >= 40 && sub2 >= 40 && sub3 >= 40;

    
        boolean distinction = passed && average >= 75;

        
        boolean specialAward = passed && average >= 90;

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);





        if (passed) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }

        if (distinction) {
            System.out.println("Distinction: YES");
        } else {
            System.out.println("Distinction: NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }
}}