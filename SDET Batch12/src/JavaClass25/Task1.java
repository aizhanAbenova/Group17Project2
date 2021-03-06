package JavaClass25;

public class Task1 {

    /*
   / Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some methods in child classes
//Define some methods specific to child classes
// Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */


        public static void main(String[] args) {
            Lenovo lenovo = new Lenovo("Lenovo");
            lenovo.login();
            HP hp = new HP("HP");
            hp.login();
            Computer[] computers = {new Lenovo("Lenovo"), new HP("HP"), new Apple("Apple")};
            for (Computer c : computers
            ) {
                c.login();
            }
        }
    }
