import java.util.Scanner;

public class J02010_SAP_XEP_DOI_CHO_TRUC_TIEP {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        for(int i =1; i <=size; i++) arr[i] = sc.nextInt();
            
        for(int i =1; i <size; i++){
            boolean checkSort = true;
            for(int j =i+1; j <=size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];  
                    arr[i] = arr[j];      
                    arr[j] = temp;   
                    checkSort = false;
                }
            }
            if(checkSort) break;
            else{
                System.out.print("Buoc " + i + ": ");
                for(int k =1; k <=size; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
