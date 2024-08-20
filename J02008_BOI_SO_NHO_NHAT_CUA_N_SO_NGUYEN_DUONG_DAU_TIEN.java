import java.util.Scanner;

public class J02008_BOI_SO_NHO_NHAT_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    } 
    public static long lcm (long a, long b){
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            long a = sc.nextLong();
            long res = 1;
            for(int i =2; i <=a; i++){
                res = lcm(res, i);
            }
            System.out.println(res);
            t--;
        }
        sc.close();
    }
}
