import java.util.Scanner;

public class J01024_SO_TAM_PHAN {
    public static boolean checkTamPhan(int n){
        while(n != 0){
            int r = n % 10;
            if(r > 2) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            if(checkTamPhan(n)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
