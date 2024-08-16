import java.math.BigInteger;
import java.util.Scanner;

public class J01009_TONG_GIAI_THUA {
    public static BigInteger giaiThua(int n){
        BigInteger res = BigInteger.ONE;
        for(int i =1; i <=n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = BigInteger.ZERO;
        for(int i =1; i <=n; i++){
            res = res.add(giaiThua(i));
        }
        System.out.println(res);
    }
}
