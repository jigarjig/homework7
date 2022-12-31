//13. Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.

package week7;

public class Thirteen {
    public static void main(String[] args) {
        for(int n=1; n<=100; n++){
            if ((n%3 == 0)){
               // System.out.print(n +", ");
                System.out.println(n);
            }
            //for(int m=1; m<=100; m++){
            if ((n%5 == 0)){
                System.out.println(n);
            }
        }}}


