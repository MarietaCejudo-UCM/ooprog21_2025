import java.util.Scanner;

public class BankBalance2 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double balance;
        double interestRate = 0.03; 

        System.out.print("Enter the initial balance > ");
        balance = scanner.nextDouble();

        int year = 1;
        int continueCalculation;

        do {

            balance += balance * interestRate;

            System.out.println("After year " + year + " at " + interestRate + " interest rate, balance is $" + balance);

            System.out.println();
            
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("   or any other number for no >> ");
            continueCalculation = scanner.nextInt();

            year++;

        } while (continueCalculation == 1);

        scanner.close();
    }
}