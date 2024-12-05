import java.util.*;
import java.io.*;

public class J07015_SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN {
    public static boolean isPrime(int n){
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n >= 2;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(Integer x : arr){
            if(isPrime(x)){
                if(map.containsKey(x)){
                    int tanSuat = map.get(x);
                    map.put(x, tanSuat + 1);
                }
                else map.put(x, 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> res = new ArrayList<>(map.entrySet());
        for(Map.Entry<Integer, Integer> x : res){
            System.out.println(x.getKey() + " " + x.getValue());
        } 

        fis.close();
    }
}