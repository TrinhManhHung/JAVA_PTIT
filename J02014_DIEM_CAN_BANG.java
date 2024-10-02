import java.util.*;

public class J02014_DIEM_CAN_BANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int sum_right = 0;
            int sum_left = 0;
            for(int i =1; i <=n; i++){
                arr[i] = sc.nextInt();
                sum_right += arr[i];
            }

            int idx = 1;
            sum_right -= arr[idx];
            for(int i =2; i <n; i++){
                sum_left += arr[i-1];
                sum_right -= arr[i];
                if(sum_left == sum_right){
                    idx = i;
                    break;
                }
            }

            if(idx == 1) System.out.println(-1);
            else System.out.println(idx);
        }
        sc.close();
    }
}

/*
2
7
-7 1 5 2 -4 3 0
5
1 2 3 4 5
 */