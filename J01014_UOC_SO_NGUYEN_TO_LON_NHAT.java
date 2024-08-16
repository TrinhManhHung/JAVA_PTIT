import java.util.Scanner;

public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {
        public static long uocnt(long n){
            long res = 1;
            for(long i =2; i * i <=n; i++){
                if(n % i == 0){
                    res = i;
                    while(n % i == 0){
                        n /= i;
                    }
                }
            }
            if(n != 1) res = n;
            return res;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int t = sc.nextInt();
            while(t != 0){
                long a = sc.nextLong();
               System.out.println(uocnt(a));
                t--;
            }
        }
}
