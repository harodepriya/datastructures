package Basic;

public class DivisionOfDatatypes {
    static void main(String[] args) {
        double x = 5/2;
        System.out.print(x + "\n");
        /* gives output as 2.0 instead of 2.5 because "5/2" is computed first
        before getting stored into 'double x' and as "5" & "2" are integers, they on
        computation return 2 and then this value is moved to 'x'
        and as 'x' is double, the value "2" gets stored as "2.0" and returns the same.
         */

        double y = 5.0/2;
        System.out.print(y + "\n"); // output: 2.5 ( as it is expected to  be )

        //USE-CASE
        int p = 69, r = 5, t = 8;
        double si = (p*r*t)/100; // should return 27.6 but gives 27
        double si_fixed = (p*r*t)/100.0; // int/double gives double
        System.out.print("Simple Interest is: " + si + "\n");
        System.out.print("Fixed Simple Interest is: " + si_fixed);

    }
}
