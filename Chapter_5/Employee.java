
public class Employee {
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate, double hoursWorked) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
            employeeNumber = MAX_EMPLOYEE_NUMBER;
        }
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularPay() {
        double regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }

    public double getOvertimePay() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        return 0.0;
    }

    public double getTotalPay() {
        return getRegularPay() + getOvertimePay();
    }
}
