import java.util.Scanner;

public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
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
            str = " " + str;
            //Tach tu
            String[] arr = str.split("\\s+");
            for(int i = 2; i < arr.length; i++){
                if(i == arr.length - 1){
                    System.out.print(rev(arr[i]) + ", ");
                }
                else    
                    System.out.print(rev(arr[i]) + " ");
            }
            arr[1] = arr[1].toUpperCase();
            System.out.println(arr[1]);
        }
        sc.close();
    }
}
