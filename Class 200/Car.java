ls
public class Car { // A class is the blueprint from which individual objects are created.// class is a disign of object//
    //object is represent class
    // I want a Buy a car which is Model call Dodge
        int modelYear;
        // two tipe of Data is Int, Car.
        String modelName;
//A constructor in Java is a special method that is used to initialize objects
        public Car(int year, String name) {
            modelYear = year;
            modelName = name;
        }
//The static keyword in Java is used for memory management mainly
        public static void main(String[] args) {
            Car myCar = new Car(2020, Dodge);
            //Automatic casting: int to double
            System.out.println(myCar.modelYear + "" + myCar.modelName);
        }
    }
// Objects have states and behaviors
// is exciquade outsid of the main mathod
// Outputs 2020 Dodge
