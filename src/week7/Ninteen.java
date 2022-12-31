// 19. Write a Java program to sort a numeric array and a string array.

package week7;
import java.util.Arrays;
public class Ninteen {


        public static void main(String[] args){

            int[] array1 = {
                    9999, 8888, 7777, 6666, 2013,
                    2022, 2458, 999, 66, 10,
                    1234, 2023, 4321,99};

            String[] array2 = {
                    "Jigar",

                    "Akshit",
                    "Arpita",
                    "Shivam",
                    "Dhwanil",
                    "Boss"
            };
            System.out.println("Original numeric array : "+Arrays.toString(array1));
            Arrays.sort(array1);
            System.out.println("Sorted numeric array : "+Arrays.toString(array1));

            System.out.println("Original string array : "+Arrays.toString(array2));
            Arrays.sort(array2);
            System.out.println("Sorted string array : "+Arrays.toString(array2));
        }
    }


