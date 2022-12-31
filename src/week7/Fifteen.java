// Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.

package week7;

public class Fifteen {
    public static void main(String[] args) {


        String day = "7";


        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                    System.out.println("Saturday");
                    break;
            case "7":
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

}
