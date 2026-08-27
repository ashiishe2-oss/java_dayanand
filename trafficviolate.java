import java.util.*;

public class trafficviolate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fine = 0;

        int speedlim = 80;

        System.out.println("Enter your vehicle number: ");
        int num = sc.nextInt();

        System.out.println("Enter your SPEED: ");
        int speed = sc.nextInt();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your vehicle type (2 or 4): ");
        int typ = sc.nextInt();

        if (age<18) {
            fine+=2000;
            
        }
        else{
            fine=fine+0;
        }

        // 2-wheeler
        if (typ == 2) {

            System.out.println("Helmet(Y/N): ");
            char hel = sc.next().charAt(0);

            if (hel == 'Y' || hel == 'y') {
                fine += 0;
            } else {
                fine += 500;
            }
        }

        // 4-wheeler
        if (typ == 4) {

            System.out.println("Seatbelt(Y/N): ");
            char belt = sc.next().charAt(0);

            if (belt == 'Y' || belt == 'y') {
                fine += 0;
            } else {
                fine += 500;
            }
        }

        // License
        System.out.println("License(Y/N): ");
        char lic = sc.next().charAt(0);

        if (lic == 'Y' || lic == 'y') {
            fine += 0;
        } else {
            fine += 5000;
        }


        if (speed>speedlim){
            fine+=2000;
        }
        else{
            fine=fine+0;
        }
        // Emergency
        System.out.println("Emergency(Y/N): ");
        char em = sc.next().charAt(0);

        if (em=='Y'||em=='y'){
            fine=0;
            System.out.println("The fine of your vehcile is : "+fine);
        }
        else{
            System.out.println("The fine of your vehcile is : "+fine);
        }
    }
}