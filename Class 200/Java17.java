public class Java17 {
    final int x = 45;
    final double PI = 6.23;

    public static void main(String[] args) {
        Java17 myObj = new Java17();
        myObj.x = 56; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 23; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}

