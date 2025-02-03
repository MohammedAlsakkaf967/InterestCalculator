
import java.util.Scanner;

public class InerestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit;
        double TotalProfit;
        String currency;
        int Time;
        double interestRate;
        double totalAnnualProfit;
        System.out.print("Choose the currency: ");
        currency = scanner.nextLine();

        System.out.print("Enter the amount of money you want to deposit: ");
        deposit = scanner.nextDouble();

        System.out.println("The money you have deposited is: "+deposit+currency);

        System.out.print("Enter the interest rate in % : ");
        interestRate = scanner.nextDouble();

        System.out.print("Your interest rate you chose will be "+interestRate+"%\n");

        System.out.print("Enter the time you want to see your profits in years  :");
        Time = scanner.nextInt();


        TotalProfit =Time*(deposit*(interestRate/100.0));

        System.out.println("After "+Time+"years your profut of teh money you have deposited is "+TotalProfit);

        totalAnnualProfit = deposit+TotalProfit;

        System.out.print("Your total annual profit is : "+totalAnnualProfit);


    }
}
