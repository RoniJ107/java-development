import java.text.NumberFormat;
import java.util.Scanner;

public class financialCalculator {
    public static void main(String[] args) {
        firstCalculator();
        futureValue();
    }

    public static void futureValue() {
        /*Future Value: futureValue = deposit * (1 + interestRate)^years
Total Interest Earned: totalInterest = futureValue - deposit*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("The deposit is: ");
        double deposit = scanner.nextInt();

        System.out.println("CD earns: ");
        double cdEarns = scanner.nextDouble();
        cdEarns = cdEarns * 0.01;
        System.out.println("The interest and matures is: ");
        double interestMatures = scanner.nextInt();

        double futureValue = deposit * (1 + cdEarns);
        double depositMoney = Math.pow((1 + cdEarns), interestMatures);
        double totalInterestEarned = futureValue - deposit;

        System.out.println("The ending balance will be: " + futureValue);
        System.out.println("And you would have earned " + totalInterestEarned + " in interest");
    }

    public static void firstCalculator() {
        Scanner stdin = new Scanner(System.in);
/*Mortgage Calculator:
//Monthly Payment: monthlyPayment = (principal * interestRate * ((1 + interestRate)^months)) / (((1 + interestRate)^months) - 1)
//Total Interest Paid: totalInterest = (monthlyPayment * months) - principal*/
        //Principal
        System.out.print("Principal:");
        int principal = stdin.nextInt();

        // interest rate
        System.out.println("Annual interest rate: ");
        float annualInterest = stdin.nextFloat();

        // loan length
        System.out.println("Period (Years): ");
        byte years = stdin.nextByte();

        stdin.close();

        float monthlyInterest = annualInterest / 100 / 12;
        int numberOfPayments = years * 12;


        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double monthlyPayment = principal * (monthlyInterest * mathPower / (mathPower - 1));
        double totalInterest = (monthlyPayment * 12) - principal;

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        // print the result

        System.out.println("Your monthly payment is: " + monthlyPaymentFormatted);
        System.out.println("Your total interest is " + totalInterest);
    }
}