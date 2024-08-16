import java.util.Scanner;

public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static int solve(int n){
        int cnt = 0;
        for(int i =1; i * i<=n; i++){
            if(n % i == 0){
                if(i % 2 == 0) cnt++;
                if((n / i) % 2 ==0 && i * i != n) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int a = sc.nextInt();
            System.out.println(solve(a));
            t--;
        }
    }
}
