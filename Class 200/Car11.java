public class Car11 {
    int X = 2;
    int Y = 4;
    public void Car11(){

    }
    public void Car11(int m, int n){

    }
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[ ] args) {
        myStaticMethod();

        Car11 myObj = new Car11();
        myObj.myPublicMethod();
    }
}
