import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J02005_GIAO_CUA_HAI_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n+1];
            int[] b = new int[m+1];
            
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i =1; i <=n; i++){
                a[i] = sc.nextInt();
                if(!map.containsKey(a[i])){
                    map.put(a[i], 1);
                }
            }
            for(int i =1; i <=m; i++){
                b[i] = sc.nextInt();
                if(map.containsKey(b[i])){
                    map.put(b[i], 2);
                }
            }
            
            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            for(Map.Entry<Integer, Integer> x : set){
                if(x.getValue() == 2){
                    System.out.print(x.getKey() + " ");
                }
            }
            
        //}
        sc.close(); 
    }
}
