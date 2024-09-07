import java.util.*;

public class J08015_CAP_SO_CO_TONG_BANG_K {
    public static long calculate (int n) {
        long res = 0;
        for(int i =1; i <=n-1; i++){
            res += (long)i;
        }
        return res * 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            HashMap<Long, Integer> map = new HashMap<>();
            
            for(int i =1; i <=n; i++){
                long x = sc.nextLong();
                if(map.containsKey(x)){
                    int tanSuat = map.get(x);
                    map.put(x, tanSuat + 1);
                }
                else {
                    map.put(x, 1);
                }
            }

            long result = 0;
            Set<Map.Entry<Long, Integer>> set = map.entrySet();
            for(Map.Entry<Long, Integer> entry : set){
                if(entry.getKey() * 2 == k){
                    result += calculate(entry.getValue());
                }
                else if (map.containsKey(k - entry.getKey())){
                    result += entry.getValue() * map.get(k - entry.getKey());
                }
            }
            result /= 2;
            System.out.println(result);
        }
        sc.close();
    }
}
/*
4
4 6
1 5 7 -1
5 6
1 5 7 -1 5
4 2
1 1 1 1
13 11
10 12 10 15 -1 7 6 5 4 2 1 1 1

2
3
6 
9
 */