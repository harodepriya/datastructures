package If_Else;
import java.util.Scanner;

public class checkInteger {
    static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double chk = sc.nextDouble(); // 3.2

        int x = (int)chk; // 3
        if (chk-x > 0) System.out.println("Is not an Integer.");
        else System.out.println("Is an Integer.");
    }
}
