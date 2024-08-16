import java.util.Scanner;

public class J01016_CHU_SO_4_VA_CHU_SO_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        int cnt = 0;
        while(n != 0){
            long d = n % 10;
            if(d == 4 || d == 7) cnt++;
            n /= 10;
        }
        if(cnt == 4 || cnt == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
