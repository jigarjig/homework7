//

package week7;

public class Person {

        //public static void main(String[] args) {


        // write your code here
        public String firstName;
        public String lastName;
        public int age;

        public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public int getAge () {
            return age;
        }

        public String setFirstName (String firstName){
            return this.firstName = firstName;
        }

        public String setLastName (String lastName){
            return this.lastName = lastName;
        }

        public void setAge ( int age){
            if (age > 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        public boolean isTeen () {
            if (age > 12 && age < 20) {
                return true;
            }
            return false;
        }

        public String getFullName () {
            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()) {
                return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return " ";
            } else {
                return firstName + " " + lastName;
            }
        }

        public static void main(String[] args) {

            Person person= new Person();
            //Person.setFirstName("");
            person.setFirstName("");
            person.setLastName("");
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John");
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith");
            System.out.println("fullName= " + person.getFullName());
        }
    }



