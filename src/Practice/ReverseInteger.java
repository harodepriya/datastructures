package Practice;
import java.util.Scanner;

public class ReverseInteger {
    public static int reverseInteger(int number){
        int num = number;
        int digit = 0;
        int revNumber = 0;

        while(number!=0){
            digit = number%10;
            revNumber=revNumber*10 + digit;
            number = number/10;
        }

        return revNumber;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            int result = reverseInteger(number);
            System.out.println(result);

            System.out.println("Enter '1' to continue & '0' to break.");
            int choice = sc.nextInt();
            if(choice==0){
                break;
            }
        }
    }
}
