import java.util.*;

class WordSet{
    private String string;
    //method
    public WordSet (String str) {
        this.string = str.trim().toLowerCase();
    }

    public String union (WordSet str2) {
        TreeSet<String> set = new TreeSet<>();
        
        String[] tmp1 = this.string.split("\\s+");
        String[] tmp2 = str2.string.split("\\s+");

        for(String x : tmp1) set.add(x);
        for(String x : tmp2) set.add(x);

        String res = "";
        for(String x : set) res += x + " ";

        return res.trim();
    }

    public String intersection (WordSet str2) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        String[] tmp1 = this.string.split("\\s+");
        String[] tmp2 = str2.string.split("\\s+");

        for(String x : tmp1){
            map.put(x, 1);
        }
        for(String x : tmp2) {
            if(map.containsKey(x)) {
                int tanSuat = map.get(x);
                map.put(x, tanSuat + 1);
            }
        }        

        String res = "";
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        for(Map.Entry<String, Integer> x : set){
            if(x.getValue() >= 2) res += x.getKey() + " ";
        }

        return res.trim();
    }
}
public class J04022_WORDSET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
/*
Lap trinh huong doi tuong
Ngon ngu lap trinh C++

c++ doi huong lap ngon ngu trinh tuong
lap trinh
 */
