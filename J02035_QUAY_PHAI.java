import java.util.*;

public class J02035_QUAY_PHAI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i =0; i <n; i++){
                arr[i] = sc.nextLong();
            }

            int idx = 1;
            for(idx =1; idx <n; idx++){
                if(arr[idx] < arr[idx-1]) break;
            }
            System.out.println(idx % n);
        }
        sc.close();
    }
}
/*
2
5
5 1 2 3 4
5
1 2 3 4 5
 */