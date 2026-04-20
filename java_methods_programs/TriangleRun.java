import java.util.Scanner;

class TriangleRun {
    public static double calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double targetDistance = 5000;

        System.out.print("Enter side1: ");
        double a = input.nextDouble();
        System.out.print("Enter side2: ");
        double b = input.nextDouble();
        System.out.print("Enter side3: ");
        double c = input.nextDouble();

        double rounds = calculateRounds(a, b, c, targetDistance);

        System.out.println("Rounds needed: " + rounds);

        input.close();
    }
}
