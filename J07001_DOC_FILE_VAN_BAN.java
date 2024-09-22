import java.io.*;
import java.util.Scanner;

public class J07001_DOC_FILE_VAN_BAN{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}