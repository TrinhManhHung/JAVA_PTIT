import java.util.Scanner;

public class J03007_SO_DEP_2 {
    public static boolean checkString (String x){
        int size = x.length();
        if(x.charAt(0) != '8' || x.charAt(size - 1) != '8') 
            return false;
        int sumOfDigit = 0;
        for(int i =0; i <size; i++){
            if(x.charAt(i) != x.charAt(size - i - 1))
                return false;
            sumOfDigit += (x.charAt(i) - '0');
        }
        if(sumOfDigit % 10 != 0) return false;
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
