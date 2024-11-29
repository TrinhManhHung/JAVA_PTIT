import java.util.*;
import java.io.*;
import java.util.HashMap;

public class J07005_SO_KHAC_NHAU_TRONG_FILE_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("DATA.IN");
        Map<Integer, Integer> map = new HashMap<>();
        DataInputStream dis = new DataInputStream(fis);
        while(dis.available() > 0){
            int number = dis.readInt();
            if(map.containsKey(number)) {
                int tanSuat = map.get(number);
                map.put(number, tanSuat + 1);
            }
            else map.put(number, 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        Collections.sort(arr, Map.Entry.comparingByKey());

        for(Map.Entry<Integer, Integer> entry : arr){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        dis.close();
    }
}