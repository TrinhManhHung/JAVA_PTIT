import java.util.Scanner;

public class J01006_TINH_SO_FIBONACCI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] F = new long[95];
        F[1] = 1; F[2] = 1;
        for(int i =3; i <=92; i++){
            F[i] = F[i-1] + F[i-2];
        }

        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            System.out.println(F[n]);
            t--;
        }
    }
}