import java.util.Scanner;

class DynamicArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        int index = 0;
        double sum = 0.0;

        while (true) {
            System.out.print("Enter number: ");
            double value = input.nextDouble();

            if (value <= 0 || index == numbers.length) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }

        System.out.println("Total Sum = " + sum);
        input.close();
    }
}
