import java.util.Scanner;

public class J01002_TINH_TONG_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            long n = sc.nextLong();
            long s = n * (n + 1) / 2;
            System.out.println(s);
            t--;
        }
    }
}