import java.util.Scanner;

public class J03006_SO_DEP_1 {
    public static boolean checkString (String x){
        int size = x.length();
        for(int i =0; i <size; i++){
            if(x.charAt(i) != x.charAt(size - i - 1))
                return false;
            if((x.charAt(i) - '0') % 2 == 1)
                return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            if(checkString(str)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
