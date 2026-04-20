import java.util.Scanner;

class NumberCheckerBasic {
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int result = checkNumber(number);

        if (result == 1)
            System.out.println("Positive");
        else if (result == -1)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        input.close();
    }
}
