import java.util.Scanner;

public class J02013_SAP_XEP_NOI_BOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i =1; i <=n; i++){
            arr[i] = sc.nextInt();
        }
        int step = 1;
        for(int i =1; i <=n-1; i++){
            boolean checkChange = false;
            for(int j =1; j <=n-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    checkChange = true;
                }
            }
            if(checkChange){
                System.out.print("Buoc " + step + ": ");
                for(int k =1; k <=n; k++) System.out.print(arr[k] + " ");
                System.out.println();
                step++;
            }
        }
        sc.close();
    }
}
