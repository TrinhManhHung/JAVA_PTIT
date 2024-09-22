import java.io.*;
import java.util.Scanner;
import java.util.*;

public class J07004_SO_KHAC_NHAU_TRONG_FILE_1{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file); 
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(map.containsKey(n)){
                int tanSuat = map.get(n);
                map.put(n, tanSuat + 1);
            }
            else {
                map.put(n, 1);
            }
        }
        
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry<Integer, Integer> e : set){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        sc.close();
    }
}