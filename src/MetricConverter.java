import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double inchesConvert = 0.0;
        double milesConvert = 0.0;
        double feetConvert = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter your measurement in meters: ");

            if(in.hasNextDouble()){
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

        } while (!done);

        feetConvert = meters * 3.281;
        inchesConvert = meters * 39.37;
        milesConvert = meters / 1609;

        System.out.printf("Your measurement in feet is: %-15.3f" , feetConvert);
        System.out.printf("Your measurement in inches is: %-15.3f" , inchesConvert);
        System.out.printf("Your measurement in miles is: %-15.3f" , milesConvert);





    }
}
