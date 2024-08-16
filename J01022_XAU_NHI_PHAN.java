import java.util.Scanner;

public class J01022_XAU_NHI_PHAN {
    public static long[] F = new long[95];

    public static int Find(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= F[n-2]) return Find(n-2, k);
        else return Find(n-1, k - F[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F[0] = 0; F[1] = 1;
        for(int i =2; i <=92; i++){
            F[i] = F[i-2] + F[i-1];
        }
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt(); long k = sc.nextLong();
            System.out.println(Find(n, k));
            t--;
        }
    }
}
