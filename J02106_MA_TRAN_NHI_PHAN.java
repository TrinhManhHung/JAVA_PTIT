import java.util.Scanner;

public class J02106_MA_TRAN_NHI_PHAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        for(int i =0; i <n; i++){
            int tmp = 0;
            for(int j =0; j <3; j++){
                int x = sc.nextInt();
                if(x == 1) tmp++;
            }
            if(tmp >= 2) cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
