import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007_LIET_KE_TU_KHAC_NHAU {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file); 
        
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }

        for(String x : set){
            System.out.println(x);
        }
        sc.close();
    }
}