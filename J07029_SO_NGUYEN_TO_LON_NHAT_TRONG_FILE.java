import java.util.*;
import java.io.*;

public class J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE {
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i =2; i <=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer num : list){
            if(checkPrime(num)){
                if(map.get(num) == null) map.put(num, 1);
                else{
                    int tanSuat = map.get(num);
                    map.put(num, tanSuat + 1);
                }
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        Collections.sort(arr, Map.Entry.comparingByKey());
        for(int i =arr.size()-1; i >= Math.max(0, arr.size()-10); i--){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
        ois.close();
    }
}