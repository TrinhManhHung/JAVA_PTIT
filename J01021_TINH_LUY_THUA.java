import java.util.Scanner;

public class J01021_TINH_LUY_THUA {
    public static long mod = 1000000007;
    public static long powMod (long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long half = powMod(a, b/2);
        if(b % 2 == 0){
            return (half % mod * half % mod) % mod;
        }
        else{
            return ((half % mod * half % mod) % mod * a % mod) % mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 1, b = 1;
        while(a != 0 || b != 0){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a != 0 || b != 0)
                System.out.println(powMod(a, b));
        }
    }
}
