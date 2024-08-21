import java.util.Arrays;
import java.util.Scanner;

public class J02102_MA_TRAN_XOAN_OC_TANG_DAN {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*n + 1];
        for(int i =1; i <=n*n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        int[][] b = new int[n+1][n+1];
        int h1 = 1, h2 = n, c1 = 1, c2 = n;
        int idx = 1;
        while(h1 <=h2 && c1 <= c2){
            for(int j =c1; j <=c2; j++){
                b[h1][j] = a[idx];
                idx++;
            }
            h1++;
            for(int i =h1; i <=h2; i++){
                b[i][c2] = a[idx];
                idx++;
            }
            c2--;
            if(c1 <= c2){
                for(int j =c2; j >=c1; j--){
                    b[h2][j] = a[idx];
                    idx++;
                }
                h2--;
            }
            if(h1 <= h2){
                for(int i =h2; i >=h1; i--){
                    b[i][c1] = a[idx];
                    idx++;
                }
                c1++;
            }
        }

        for(int i =1; i <=n; i++){
            for(int j =1; j <=n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
