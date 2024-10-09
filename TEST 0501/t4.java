import java.util.*;

public class t4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(n < 0) n = -1 * n;
            int res = 0;
            while(n != 0){
                res += n % 10;
                n /= 10;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
/*
2
1234
-123

10
6
 */