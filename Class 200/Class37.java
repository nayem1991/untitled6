public class Class37 {
        public void Class37lSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Class37 {
        public void Class37Sound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Class37 {
        public void Class37Sound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class MyMainClass {
        public static void main(String[] args) {
            Class37 myClass37 = new Class37();  // Create a Animal object
            Class37 myPig = new Pig();  // Create a Pig object
            Class37 myDog = new Dog();  // Create a Dog object

            myClass37.Class37Sound();
            myPig.Class37Sound();
            myDog.Class37Sound();
        }
    }
