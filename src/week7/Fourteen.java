// 14. Write a program that tells us input value is number or an alphabet or symbol.

package week7;
import java.util.Scanner;
public class Fourteen {

    public static void main(String[] args) {

        // declare a variable
        char c = '8';

        // checks if c is an alphabet
        if (Character.isAlphabetic(c)) {
            System.out.println(c + " is an alphabet.");
        }



        else {
            System.out.println(c + " is not an alphabet.");
        }
    }
}