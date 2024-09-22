import java.io.*;
import java.util.Scanner;

public class J07002_TINH_TONG{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file); 
        long sum = 0;       
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                sum += sc.nextInt();
            }
            else{
                sc.next();
            }
        }
        System.out.println(sum);
        sc.close();
    }
}