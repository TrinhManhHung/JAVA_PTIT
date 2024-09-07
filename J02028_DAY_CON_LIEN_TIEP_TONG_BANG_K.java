import java.util.*;

public class J02028_DAY_CON_LIEN_TIEP_TONG_BANG_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n+1];
            long sum = 0;
            for(int i =1; i <=n; i++){
                a[i] = sc.nextLong();
            }

            boolean checkFind = false;
            HashSet<Long> set = new HashSet<>();
            for(int i =1; i <=n; i++){
                if(k == a[i]){
                    checkFind = true;
                    break;
                }
                sum += a[i];
                if(sum == k || (sum >= k && set.contains(sum - k))){
                    checkFind = true;
                    break;
                }
                set.add(sum);
            }

            if(checkFind == true) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
/*
3
6 33
1 4 20 3 10 5
7 7
1 4 0 0 3 10 5
2 0
1 4

YES
YES
NO
 */