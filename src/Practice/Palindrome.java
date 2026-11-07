package Practice;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your number: ");
            int input = sc.nextInt(); // 242

            boolean result = isPalindrome(input);
            if(result){
                System.out.println("The number is a Palindrome Number.");
            }else{
                System.out.println("The number is not a Palindrome Number.");
            }

            System.out.println("Enter 1 to continue, 0 to stop:");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }
        }
    }

    public static boolean isPalindrome(int input){
        if(input < 0){
            return false;
        }

        int revNumber = 0;
        int number=input;

        while(number>0){
            int digit = number%10;
            revNumber = revNumber*10 + digit;
            number = number/10;
        }

        if(revNumber==input){
            return true;
        }else{
            return false;
        }
    }
}
