package If_Else;
import java.util.Scanner;

class Divisibility {
    void check(){
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("Divisible!");
        }
        else{
            System.out.println("Not divisible.");
        }
    }
}

public class evenOdd {
    static void main(String[] args) {
        System.out.println("Even or Odd, Lets check!");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("the entered value is even!");
        }
        else {
            System.out.println("the entered value is odd.");
        }

        Divisibility five = new Divisibility();
        five.check();
    }
}


