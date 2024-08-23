import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {
    public static boolean Check(String str){
        int cntChange = 0;
        int size = str.length();
        for(int i =0; i <= size/2 -1; i++){
            if(str.charAt(i) != str.charAt(size-i-1)){
                cntChange++;
            }
        }
        if((size % 2 == 0 && cntChange == 1) || (size % 2 == 1 && cntChange <= 1)) return true;
        return false;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            if(Check(str)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
