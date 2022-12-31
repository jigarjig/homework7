// 7. Write a java program to input any number and find out if it’s odd or even

package week7;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number% 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is Odd");

    }
}
