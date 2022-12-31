// 3. Declare multidimensional array and store 5 countries and their
//capital and print them in console.


package week7;

public class MultiCountry {
    public static void main(String[] args) {

        String[][] c ={{"United Kingdom", "France", "India", "Italy", "Germany"},
                      {"London", "Paris", "Delhi","Rome", "Berlin"}};



        System.out.println(" 1: Country name is "+c[0] [0] + "  And  Capital is " +c[1] [0]);
        System.out.println(" 2: Country name is "+c[0] [1] + "  And  Capital is " +c[1] [1]);
        System.out.println(" 3: country name is "+c[0] [2] + "  And  Capital is " +c[1] [2]);
        System.out.println(" 4: Country name is "+c[0] [3] + "  And  Capital is " +c[1] [3]);
        System.out.println(" 5: Country name is "+c[0] [4] + "  And  Capital is " +c[1] [4]);

}}