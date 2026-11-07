package If_Else;
import java.util.Scanner;

//Take an integer input and print its absolute value.
public class absoluteValue {
    static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0){
            System.out.println(num);
        }
        else if (num == 0){
            System.out.println("0");
        }
        else {
            System.out.println(num * (-1));
        }
    }
}
