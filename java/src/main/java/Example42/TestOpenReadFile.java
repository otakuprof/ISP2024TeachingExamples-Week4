package Example42;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestOpenReadFile {

    public static void main(String[] args) {
        try{
            openFile("car.txt");
            System.out.println("B");
        }catch (FileNotFoundException ex){
            System.out.println("File Cannot Be Found");
        }
        // Execution continues as normal once you are out of the catch block
        System.out.println("A");

    }

    public static String openFile(String fileName) throws FileNotFoundException  {

        File file = new File(fileName);
        // Scanner(file) throws a FileNotFoundException
        Scanner scanner = new Scanner(file);
        String out = "";
        while( scanner.hasNext()){
            String s = scanner.nextLine();
            out = out + s;
        }
        return out;

    }

    public static String openFileNew(String fileName)   {
        // DECISION: handle exception within the method. Declaration not needed.
        File file = new File(fileName);
        try{
            // Scanner(file) throws a FileNotFoundException
            Scanner scanner = new Scanner(file);
            String out = "";
            while( scanner.hasNext()){
                String s = scanner.nextLine();
                out = out + s;
            }
            return out;
        }catch(Exception ex){
            return "";
        }



    }
}
