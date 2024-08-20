import java.util.*;
//System.out.println();
public class J02007_DEM_SO_LAN_XUAT_HIEN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (test <= t) {
            System.out.println("Test " + test + ":");
            int n = sc.nextInt();
            int[] a = new int[n+1];
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int i =1; i <=n; i++){
                a[i] = sc.nextInt();
                if(map.containsKey(a[i])){
                    int tanSuat = map.get(a[i]);
                    map.put(a[i], tanSuat + 1);
                }
                else{
                    map.put(a[i], 1);
                }
            }
            
            for(int i =1; i <=n; i++){
                if(map.containsKey(a[i])){
                    System.out.println(a[i] + " xuat hien " + map.get(a[i]) + " lan");
                    map.remove(a[i]);
                }
            }
            test++;
        }
        sc.close(); 
    }
}
