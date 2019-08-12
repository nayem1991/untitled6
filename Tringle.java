public class Tringle {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) // for number of rows
        {
            for (int j = i; j < 4; j++)// soace creation for left
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* "); //
            }
            System.out.println(); // is going to next raw
        }
    }
}

