import java.util.*;

public class J02022_SO_XA_CACH {
    private static int n;
    private static int[] arr; 
    private static int[] used;
    public static void checkAndRes(){
        boolean check = true;
        for(int i =1; i <n; i++){
            if(Math.abs(arr[i] - arr[i+1]) == 1){
                check = false;
                break;
            }
        }
        if(check){
            for(int i =1; i <=n; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
    public static void Try(int i){
        if(i > n){
            checkAndRes();
            return;
        }
        for(int j =1; j <=n; j++){
            if(used[j] == 0){
                used[j] = 1;
                arr[i] = j;
                Try(i+1);
                used[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            arr = new int[n+1];
            used = new int[n+1];
            for(int i =1; i <=n; i++){
                arr[i] = 0;
                used[i] = 0;
            }
            Try(1);
        }
        sc.close();
    }
}
