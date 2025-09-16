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


    }
}