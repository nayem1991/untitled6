public class java8 {
        int x = 54;

        public static void main(String[] args) {
            java8 myObj1 = new java8();  // Object 1
            java8 myObj2 = new java8();  // Object 2
            myObj2.x = 34;
            System.out.println(myObj1.x);  // Outputs 5
            System.out.println(myObj2.x);  // Outputs 25
        }
    }