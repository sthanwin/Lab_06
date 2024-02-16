import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numGal = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        boolean done = false;
        String trash = "";


        do {
            System.out.print("Enter the number of gallons in a tank: ");

            if(in.hasNextDouble()){
                numGal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

        } while (!done);

        done = false;

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");

            if(in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

        } while (!done);

        done = false;

        do {
            System.out.print("Enter the price of gas per gallon: ");

            if(in.hasNextDouble()){
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

        } while (!done);

        double costPer100Miles = 100 / numGal * gasPrice;
        double distance = numGal * fuelEfficiency;


        System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");
        System.out.printf("The cost per 100 miles is: $ %-15.3f" , costPer100Miles);




        
    }
}
