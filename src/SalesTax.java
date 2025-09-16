//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax {
    public static void main(String[] args) {
        //Sales tax declarations
        double taxRate = 0.05;
        double salesTax = 0;
        double purchasePrice = 14250; //random value chose, you can input any price

            salesTax = purchasePrice * taxRate;
            System.out.println(" The sales tax on " + purchasePrice + " is $ " + salesTax);

            System.out.println();
            System.out.println();

        System.out.println( "Task 2 Annual Maintenance Cost");
        double summerCost = 64;
        double springCost = 79;
        double autumnCost = 46;
        double winterCost = 35;
        double totalCost = 0; //placeholder input for year

        totalCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println( "The total annual maintenance cost is $" + totalCost);
        System.out.println( "Monthly CC Balance"); //Task 3
        double balance = 5000.0;
        double interestRate = 0.17;
        double firstMonth = 0;
        double secondMonth = 0;

        firstMonth = balance + (balance * interestRate);
        secondMonth = firstMonth + (firstMonth * interestRate);

        System.out.println( " At the end of the first month the balance equals $" + firstMonth);
        System.out.println( " At the end of the second month the balance equals $" + secondMonth);

        System.out.println();
        System.out.println();

    }
}