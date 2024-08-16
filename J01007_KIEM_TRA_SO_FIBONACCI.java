import java.util.Scanner;

public class J01007_KIEM_TRA_SO_FIBONACCI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] F = new long[95];
        F[0] = 0; F[1] = 1;
        for(int i =2; i <=92; i++){
            F[i] = F[i-1] + F[i-2];
        }
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            boolean check = false;
            for(int i =0; i <=92; i++){
                if(n == F[i]){
                    check = true;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
