import java.util.*;
import java.io.*;

public class J07021_CHUAN_HOA_XAU_HO_TEN_TRONG_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine().trim();
            if(line.equals("END")){
                break;
            }
            String[] words = line.split("\\s+");
            String res = "";
            for(int i =0; i <words.length; i++){
                res += words[i].substring(0, 1).toUpperCase();
                res += words[i].substring(1).toLowerCase() + " ";
            }
            System.out.println(res);
        }
        sc.close();
    }
}
