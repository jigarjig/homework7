//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA –PF
package week7;

public class Six {
    static int id = 2564, bs = 25000;
    static String name="Jay";
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("|      Salary Slip            |");
        System.out.println("-------------------------------");
        System.out.println("| Employee Id   :    "+id+"     |");
        System.out.println("| Employee Name :    "+name+"      |");
        System.out.println("|-----------------------------|");
        System.out.println("| Basic Salary  :    "+bs+"    |");


        System.out.println("| HRA 10%       :    "+(bs*10/100)+"     | ");
        System.out.println("| TA 8%         :    "+(bs*8/100)+"     |");
        System.out.println("| DA 9%         :    "+(bs*9/100)+"     |");
        System.out.println("| PF 20%        :    "+(bs*20/100)+"     |");
        System.out.println("|------------------------------");
        System.out.println("| Gross Salary  :    "+((bs+(bs*10/100)+(bs*8/100)+(bs*9/100)-(bs*20/100)))+"    |");
        System.out.println("|                             |");
        System.out.println("-------------------------------");

    }
}



