package Basic;                             // package = groups related Java classes; Basic = package name

import java.io.BufferedReader;           // import = lets us use BufferedReader without writing full name
import java.io.InputStreamReader;       // imports InputStreamReader for converting byte input to characters
import java.io.IOException;            // imports IOException for handling input/output errors

public class inputWithoutScanner {
    // public = accessible from anywhere
    // class = defines a class
    // inputWithoutScanner = class name

    public static void main(String[] args) throws IOException {

        // public = JVM can access main()
        // static = main() belongs to the class, not an object
        // void = main() returns nothing
        // main = starting point of Java program
        // String[] = array of Strings
        // args = command-line arguments
        // throws IOException = main() may produce an IOException

        BufferedReader br =                         // BufferedReader = reads text efficiently
                new BufferedReader(                     // new = creates a new object in memory
                        new InputStreamReader(              // InputStreamReader = converts byte input into characters
                                System.in                       // System.in = standard input, usually the keyboard
                        )
                );

        System.out.print("Enter your name gng: ");
        String name = br.readLine();

        System.out.println("hi " + name);
    }
}



