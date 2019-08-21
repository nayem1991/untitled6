package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {

            File file = new File("/Users/nayemjoy/IdeaProjects/untitled10/src/file/abcd.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID: " + id + "Name: " + name);
            }
            scanner.close();

        } catch (Exception.e) {
            e.printStacksTrace();
            final {
                System.out.println("i got it");
            }
        }

    }
