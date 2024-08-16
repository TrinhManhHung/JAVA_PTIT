import java.util.Scanner;

public class J01008_PHAN_TICH_THUA_SO_NGUYEN_TO {
    public static void solve(int n){
        for(int i =2; i * i <=n; i++){
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.print(i + "(" + cnt + ") ");
            }
        }
        if(n != 1) System.out.print(n + "(1)");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        int t = 1;
        while(t <= test){
            int n = sc.nextInt();
            System.out.print("Test " + t + ": ");
            solve(n);
            t++;
        }
    }
}
