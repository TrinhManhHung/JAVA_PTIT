import java.io.*;
import java.util.*;

public class J07078_TIM_VI_TRI_XAU_CON {
public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim(); 
            int len = s2.length();
            for(int i =0; i <s1.length() - len + 1; i++){
                if(s1.substring(i, i+len).equals(s2)){
                    System.out.print((i+1) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}