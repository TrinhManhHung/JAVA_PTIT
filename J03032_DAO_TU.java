import java.util.Scanner;

public class J03032_DAO_TU {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            String[] arr = str.split("\\s+");
            for(String x : arr){
                for(int i =x.length()-1; i >=0; i--){
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
