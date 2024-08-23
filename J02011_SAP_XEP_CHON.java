import java.util.Scanner;

public class J02011_SAP_XEP_CHON {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Input
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        for(int i =1; i <=size; i++) arr[i] = sc.nextInt();
        //Selection Sort    
        for(int i =1; i <size; i++){
            int minElement = arr[i];
            int idxOfMin = i;

            for(int j =i+1; j <=size; j++){
                if(arr[j] < minElement){
                    minElement = arr[j];
                    idxOfMin = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[idxOfMin];
            arr[idxOfMin] = temp;
            //Output
            System.out.print("Buoc " + i + ": ");
            for(int k =1; k <=size; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
