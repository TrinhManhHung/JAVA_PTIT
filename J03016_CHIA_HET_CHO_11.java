import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static boolean CheckModEleven(String str){
        int sumOfDigit = 0;
        for(int i =0; i <str.length(); i++){
            if(i % 2 == 0) sumOfDigit += (str.charAt(i) - '0');
            else sumOfDigit -= (str.charAt(i) - '0');
        }
        return (sumOfDigit % 11 == 0);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            if(CheckModEleven(str)){
                System.out.println(1);
            }
            else
                System.out.println(0);
        }
        sc.close();
    }
}
