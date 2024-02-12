package Example42;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestOpenReadFile {

    public static void main(String[] args) {
        try{
            openFile("car.txt");
        }catch (FileNotFoundException ex){
            System.out.println("File Cannot Be Found");
        }
        System.out.println("A");

    }

    public static String openFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);

        Scanner scanner = new Scanner(file);
        String out = "";
        while( scanner.hasNext()){
            String s = scanner.nextLine();
            out = out + s;
        }
        return out;

    }
}
