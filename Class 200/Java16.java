public class Java16 {
        int modelYear;
        String modelName;

        public Java16(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            Java16 myCar = new Java16(2020, "Dodge");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
    }

// Outputs 1969 Mustang
