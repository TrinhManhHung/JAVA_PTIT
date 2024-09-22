import java.io.*;
import java.util.Scanner;

public class HELLOFILE_HELLO_FILE {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Hello.txt");
        Scanner sc = new Scanner(file); 
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}