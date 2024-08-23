import java.util.Scanner;

public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static String rev(String str){
        if (str.isEmpty()) {  
            return "";
        }
        String res = "";
        res += Character.toUpperCase(str.charAt(0));
        res += str.substring(1, str.length()).toLowerCase();
        return res;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Input
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            //Tach tu
            String[] arr = str.split("\\s+");
            for(String x : arr){
                System.out.print(rev(x) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
