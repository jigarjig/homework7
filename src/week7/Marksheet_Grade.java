package week7;

/*public class Marksheet_Grade {
    static String Name = "Jay,";
    static int RollNo = 8; Maths =98
    static String Subjects = "Marks";
    static int = "Maths" = 98,

*/
public class Marksheet_Grade {
    static String name = "Jay"; //Subject = "Marks";
    static String sub="Marks";
    static int roll =8, Maths=98,Science=90, English = 85; // Total =Maths+Science+English;
    static int Total =(Maths+Science+English);
    static double percentage =(Total * 100/300);

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|               Marksheet              |");
        System.out.println("|  Name       :        "+name+"             |");
        System.out.println("|  RollNo     :        "+roll+"               |");
        System.out.println("|                                      |");
        //String Marks = new String();
        System.out.println("|  Subjects   :        " + sub +"           |");
        System.out.println("|--------------------------------------|");
        if (Maths <=100 && Maths>=0) {
            System.out.println  ("| Maths    :       "+Maths  +"                  |" );
        }else {
            System.out.println("invalid");}
        if (Science <=100 && Science>=0) {
            System.out.println  ("| science  :       "+Science  +"                  |" );
        }else {
            System.out.println("invalid");}
        if (English <=100 && English>=0) {
            System.out.println  ("| English  :       "+English  +"                  |" );
        }else {
            System.out.println("invalid");
        }
        System.out.println("|--------------------------------------|");
        System.out.println("|  Total      :       " +Total+ "              |");
        System.out.println("|--------------------------------------|");
        System.out.println("|  Percentage :       " +percentage+" %           |");
        if(percentage>=35){
            System.out.println("|  Result :            Pass            |");
        }else {
            System.out.println("|  Result  :     Fail              |");
        }
        if(percentage >=80) {
            System.out.println("|  Grade   :          A+               |");
        }else if (percentage <=80 && percentage >=60) {
            System.out.println("|  Grade   :     A              |");
        }else if (percentage<=60 && percentage >=50) {
            System.out.println("|   Grade  :     B              |");
        }else if (percentage<=50 && percentage>=35 ) {
            System.out.println("|   Grade  :     C              |");
        }else{
            System.out.println("Fail");
        }
        System.out.println("---------------------------------------");


    }}
