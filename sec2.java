import java.util.*;

public class sec2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name is : " + name + "  and age is : " + age);

        sc.close();
    }
}
