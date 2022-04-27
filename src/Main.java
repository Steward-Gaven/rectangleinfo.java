import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double length = 0;
        double width = 0;
        double perimeter;
        double area;
        double diagonal;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
        } else {
            String trash1 = in.nextLine();
            System.out.println("You entered: " + trash1);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("Enter width of rectangle: ");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
        } else {
            String trash2 = in.nextLine();
            System.out.println("You entered: " + trash2);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter of rectangle is: " + perimeter);

        area = length * width;
        System.out.println("Area of rectangle: " + area);

        diagonal = (width * width) + (length * length);
        Double diagonal2 = Math.pow(diagonal, .5);
        System.out.println("Diagonal of rectangle is: " + diagonal2);
    }
}