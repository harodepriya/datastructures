package Practice;
import java.util.Scanner;

public class DecisionStatements {
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("User can vote!");
        }
        else if(age<=5){
            System.out.println("User is a baby");
        }
        else {
            System.out.println("User can't vote");
        }
    }
}
