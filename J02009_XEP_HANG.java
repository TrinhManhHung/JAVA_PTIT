import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;
import java.util.Scanner;

public class J02009_XEP_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Entry<Integer, Integer>> list = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            list.add(new SimpleEntry<>(key, val));
        }

        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> a, Entry<Integer, Integer> b) {
                return a.getKey().compareTo(b.getKey());
            }
        });

        int timeOfCurrentFinish = 0;
        for(Entry<Integer, Integer> x : list){
            int key = x.getKey();
            int val = x.getValue();
            timeOfCurrentFinish = Math.max(timeOfCurrentFinish, key) + val;
        }
        System.out.println(timeOfCurrentFinish);
        sc.close();
    }
}
