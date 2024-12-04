import java.util.Scanner;

class Employee {
    private double basicSalary;
    private double DA;
    private double otherAllowances;

    public Employee(double basicSalary, double DA, double otherAllowances) {
        this.basicSalary = basicSalary;
        this.DA = DA;
        this.otherAllowances = otherAllowances;
    }

    public double calculateTotalSalary() {
        return basicSalary + DA + otherAllowances;
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter DA percentage: ");
        double DApercentage = scanner.nextDouble();
        double DA = (DApercentage / 100) * basicSalary;

        System.out.print("Enter other allowances: ");
        double otherAllowances = scanner.nextDouble();

        Employee employee = new Employee(basicSalary, DA, otherAllowances);
        double totalSalary = employee.calculateTotalSalary();

        System.out.println("Total salary: " + totalSalary);
    }
}