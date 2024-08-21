
import java.util.Scanner;

public class J02034_BO_SUNG_DAY_SO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i <n; i++) a[i] = sc.nextInt();
        if(a[n-1] == n) System.out.println("Excellent!");
        else{
            int cnt = 1;
            for(int i =0; i <n; i++){
                if(cnt < a[i]){
                    while(cnt < a[i]){
                        System.out.println(cnt);
                        cnt++;
                    }
                }
                cnt++;
            }
        }
        sc.close();
    }
}
