import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double length = 0.0;
        boolean done = false;
        String trash = "";
        double area = 0.0;
        double diagonal = 0.0;

        do {
            System.out.print("Enter the length of the rectangle: ");

            if(in.hasNextDouble()){
                length = in.nextDouble();
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
            System.out.print("Enter the width of the rectangle: ");

            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Enter a valid input not: " + trash);
            }

        } while (!done);

        area = length * width;
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));


        System.out.println("The area of the rectangle is: " + area);
        System.out.printf("The diagonal of the rectangle is: %-15.3f" , diagonal);

    }
}
