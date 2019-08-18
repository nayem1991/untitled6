package StringBuilder;

public class StringDemo {
    public static void main(String[] args){

        StringBuilder nj = new StringBuilder("Nayem don't know Java");

        System.out.println("nj = "+nj);

        nj.append(" Joy ");


        nj.reverse();

        System.out.println("nj = "+nj);
    }
}
