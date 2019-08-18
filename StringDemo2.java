package StringBuilder;

public class StringDemo2 {
    public static void main(String[] args){

        StringBuilder nj = new StringBuilder("Dog");

        System.out.println(nj);

        nj.append((" Joy "));
        nj.append(27);

        System.out.println(nj);
        nj.delete(0, 5);
        System.out.println(nj);
    }


    }
