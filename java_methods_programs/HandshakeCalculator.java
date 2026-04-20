import java.util.Scanner;

class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        if (n < 0) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        int result = calculateHandshakes(n);
        System.out.println("Maximum handshakes = " + result);

        input.close();
    }
}
