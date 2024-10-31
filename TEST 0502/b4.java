import java.util.*;


public class b4 {
    public static boolean check(String s){
        for(int i =1; i <s.length(); i++){
            if(s.charAt(i) < s.charAt(i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String n = sc.next();
            arr.add(n);
            if(check(n)){
                if(!map.containsKey(n)){
                    map.put(n, 1);
                }
                else{
                    int tanSuat = map.get(n) + 1;
                    map.put(n, tanSuat + 1);
                }
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<Integer, String>> arr2 = new ArrayList<>();

        for(Map.Entry<String, Integer> x : set){
            String num = x.getKey();
            int tanSuat = x.getValue();
            arr2.add({tanSuat, num});
        }
        sc.close();
    }
}
