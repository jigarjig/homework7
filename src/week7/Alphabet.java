// 10. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

package week7;

import java.util.Scanner;

public class Alphabet{
    public static void main(String[] args) {
        String a = "London", b = "Paris", c = "Ahmedabad", d = "Delhi", e = "NewYork", f = "Tokyo";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Alphabet : ");
        char i = s.nextLine().charAt(0);

        if (i == 'a') {
            System.out.println(a);
        } else if (i == 'b') {
            System.out.println(b);
        } else if (i == 'c') {
        System.out.println(c);
        } else if  (i == 'd'){
            System.out.println(d);
        } else if (i == 'e') {
            System.out.println(e);
        } else if (i == 'f') {
            System.out.println(f);
        } else System.out.println("Invalid Alphabet");
    }

        }




