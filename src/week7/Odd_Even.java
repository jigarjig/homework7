// 1. Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

package week7;
import java.util.Scanner;

public class Odd_Even {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a number: ");
            int number = sc.nextInt();



            String OddEven = (number% 2 == 0) ? "Even" : "Odd";

            System.out.println(number+ " is " + OddEven);

        }
    }

