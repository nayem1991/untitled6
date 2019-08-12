public class Tringle3 {
    public static void main(String[] args){
        int A=5;
        for(int i=1;i<=A;i++)
        {
            for(int j=1;j<=A;j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
            }
        }
    }
