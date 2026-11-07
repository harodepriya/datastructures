package Basic;
import java.util.Scanner;
public class CharDatatype {
    static void main(String[] args) {
//        char cat = 'e'; // char datatype is only for a single character
//        System.out.print(cat);

        /*
        ASCII VALUES - integer value
        a = 97, b = 98, ..z = (a+25)
        A = 65, B = 66, ..Z = (A+25)
        0 = 48, 1 = 49, ..9 =
         */

        int tc = 'A'; // implicit typecasting
        System.out.println(tc);

        char sell = 'B';
        System.out.println(sell+0); //typecasting w/o typecasting

        char sweet = 'a';
        int gulab = (int) sweet; // explicit typecasting
        System.out.println(gulab);

//        int sum = 100;
//        double sum$ = (double) sum;
//        System.out.println(sum$);

        int chk = ' ';
        System.out.println(chk);

        /*
        BODMAS

        /,*,% >> +,-
        always go left -> right for arithmetic operators
         */

        // x = x + 5; can be written as x += 5;

        int x = 10;
        int y = x++;
        System.out.println(x + " " + y);
    }
}
