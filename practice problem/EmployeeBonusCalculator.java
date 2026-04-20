import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;
        double[] salary = new double[totalEmployees];
        double[] years = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double totalBonus = 0;

        for (int i = 0; i < totalEmployees; i++) {
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = input.nextDouble();

            if (salary[i] < 0 || years[i] < 0) {
                System.err.println("Invalid input. Try again.");
                i--;
            }
        }

        for (int i = 0; i < totalEmployees; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            totalBonus += bonus[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        input.close();
    }
}
