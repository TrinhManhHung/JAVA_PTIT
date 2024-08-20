import java.util.*;

public class J02006_HOP_CUA_HAI_DAY_SO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n+1];
            int[] b = new int[m+1];
            
            TreeSet<Integer> set = new TreeSet<>();
            for(int i =1; i <=n; i++){
                a[i] = sc.nextInt();
                set.add(a[i]);
            }
            for(int i =1; i <=m; i++){
                b[i] = sc.nextInt();
                set.add(b[i]);
            }
            for(Integer x : set){
                System.out.print(x + " ");
            }
            
        //}
        sc.close(); 
    }
}
