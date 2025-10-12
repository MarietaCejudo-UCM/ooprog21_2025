import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Employee Number: ");
        int employeeNumber = input.nextInt();
        
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regural pay rate? ");
        double payRate = input.nextDouble();

        Employee employee = new Employee(employeeNumber, payRate, hoursWorked);

        double regularPay = employee.getRegularPay();
        double overtimePay = employee.getOvertimePay();

        
        System.out.printf("Regular Pay is $%.1f\n", regularPay);
        System.out.printf("Overtime Pay is $%.1f\n", overtimePay);
    
        input.close();
    }
}
