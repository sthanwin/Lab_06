import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cTemp = 0.0;
        double converter = 0.0;
        double fTemp = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter you temperature in C: ");

            if (in.hasNextDouble()) {
                cTemp = in.nextDouble();
                in.nextLine();
                converter = (cTemp * 9/5) + 32;
                fTemp = converter;
                done = true;
                System.out.println("Your temperature in F is: " + fTemp);
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);
            }
        } while (!done);


    }
}