
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07076_SAP_XEP_MA_TRAN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.next()); 
            int m = Integer.parseInt(sc.next());
            int col = Integer.parseInt((sc.next())) - 1;

            int[][] arr = new int[n][m];
            int[] tam = new int[n];
            for(int i =0; i <n; i++){
                for(int j =0; j <m; j++){
                    arr[i][j] = Integer.parseInt(sc.next());
                    if(j == col) tam[i] = arr[i][j];
                }
            }

            Arrays.sort(tam);
            for(int i =0; i <n; i++){
                for(int j =0; j <m; j++){
                    if(j == col) System.out.print(tam[i] + " ");
                    else{
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
/*

 */