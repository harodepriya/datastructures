package If_Else;
import java.util.Scanner;

public class profitOrLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price: ");
        double sp = sc.nextDouble();

        if (sp-cp > 0) System.out.println("Profit!");
        else if (sp-cp == 0) System.out.println("No Loss, No Profit.");
        else System.out.println("Loss!");

    }
}
