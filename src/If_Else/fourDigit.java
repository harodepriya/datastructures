package If_Else;
import java.util.Scanner;

public class fourDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = sc.nextInt();

        if ((number > 999)&&(number < 10000)) System.out.println("Yes! It is four digit");
        else System.out.println("No, Its not a four digit number");
    }
}
