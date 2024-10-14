import java.util.*;

public class J08011_LIET_KE_VA_DEM {
    public static ArrayList<String> tam = new ArrayList<>();

    public static int index(String a, String b){
        int idxOfa = -1;
        int idxOfb = -1;
        for(int i =0; i <tam.size(); i++){
            if(tam.get(i).equals(a) && idxOfa == -1){
                idxOfa = i;
            }
            if(tam.get(i).equals(b) && idxOfb == -1){
                idxOfb = i;
            }            
        }
        return idxOfa - idxOfb;
    }

    public static boolean checkNum(String s){
        for(int i =1; i <s.length(); i++){
            if(s.charAt(i) < s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        while(sc.hasNext()){
            String s = sc.next().trim();
            if(checkNum(s)){
                tam.add(s);
                if(map.containsKey(s)){
                    int tanSuat = map.get(s);
                    map.put(s, tanSuat + 1);
                }
                else{
                    map.put(s, 1);
                }
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<Map.Entry<String, Integer>>(set);
        
        Collections.sort(arr, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
                if(a.getValue() != b.getValue()){
                    return b.getValue() - a.getValue();
                }
                return index(a.getKey(), b.getKey());
            }
        });

        for(int i =0; i <arr.size(); i++){
            System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
        }
        sc.close();
    }
}
/*

 */