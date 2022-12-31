//5. Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

package week7;

import java.util.Scanner;
public class Student_Grade extends Exception {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter name of student: ");
        String n = in.nextLine();
        System.out.print("Enter roll no of student: ");
        int r = in.nextInt();

      {
      System.out.print("Enter marks in Maths subject: ");
            int m1 = in.nextInt();
            if (m1<=100 && m1>=0) {
                System.out.println(m1);
            }else {
                System.out.println("Invalid input");
            }


            System.out.print("Enter marks in science subject: ");
        int m2 = in.nextInt();
        System.out.print("Enter marks in English subject: ");
        int m3 = in.nextInt();

        int t = m1 + m2 + m3 ;
        double p = t / 300.0 * 100.0;
        String g = "";
        if (p >= 80)
            g = "A+";
        else if (p >= 60)
            g = "A";
        else if (p >=50)
            g = "B";
        else if (p >= 35)
            g = "C";



        System.out.println("Total Marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);
    }
}
}

