import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeSalaries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient:");
        double coEfficient = scanner.nextDouble();

        System.out.println("Enter years :");
        int year = scanner.nextInt();

        if (coEfficient >= 1 && coEfficient <= 5) {
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            String result = formatter.format(payRoll(coEfficient, year));
            System.out.println("Real Salary : " + result + " VND");
        } else {
            System.out.println("Please enter coefficient from 1 to 5");
        }
    }

    public static double payRoll(double coEfficient, int years) {
        final int Salary = 4000000;
        final int Bonus = 500000;
        return coEfficient * Salary + years * Bonus;

    }
}