import java.util.*;

public class sec9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num: ");

        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The num is positive: ");
        }

        else if (num == 0) {
            System.out.println("The num is zero: ");
        } else {
            System.out.println("The num is negative: ");
        }
    }
}