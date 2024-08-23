import java.util.Scanner;

public class J03024_SO_UU_THE {
    public static int Check(String str){
        int size = str.length();
        int cntOdd = 0; int cntEven = 0;
        for(int i =0; i <size; i++){
            if(str.charAt(i) == '0' || str.charAt(i) == '2' || str.charAt(i) == '4' || str.charAt(i) == '6' || str.charAt(i) == '8'){
                cntEven++;
            }
            else if(str.charAt(i) == '1' || str.charAt(i) == '3' || str.charAt(i) == '5' || str.charAt(i) == '7' || str.charAt(i) == '9'){
                cntOdd++;
            }
            else 
                return 0;
        }
        if((size % 2 == 0 && cntEven > cntOdd) || (size % 2 == 1 && cntEven < cntOdd)) return 2;
        return 1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            if(Check(str) == 2) System.out.println("YES");
            else if(Check(str) == 1) System.out.println("NO");
            else if(Check(str) == 0)  System.out.println("INVALID");
        }
        sc.close();
    }
}
