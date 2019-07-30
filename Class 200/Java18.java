public class Java18 {
        // Static method
        static void myStaticMethod() {
            System.out.println("good people");
        }

        // Public method
        public void myPublicMethod() {
            System.out.println("I dont like fat people");
        }
        // Main method
        public static void main(String[ ] args) {
            myStaticMethod(); // Call the static method
            // myPublicMethod(); This would output an error

            Java18 myObj = new Java18(); // Create an object of MyClass
            myObj.myPublicMethod(); // Call the public method
        }
    }