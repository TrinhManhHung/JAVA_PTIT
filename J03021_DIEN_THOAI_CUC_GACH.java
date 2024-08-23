import java.util.HashMap;
import java.util.Scanner;

public class J03021_DIEN_THOAI_CUC_GACH {
    public static boolean checkThuanNghich(String str){
        int size = str.length();
        for(int i =0; i <size; i++){
            if(str.charAt(i) != str.charAt(size - i - 1))
                return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //map from Alpha to Digit
        HashMap<Character, Integer> map = new HashMap<>();
        int digit = 2;
        for(int i =0; i <26; i++){
            char x = (char)('A' + i);
            map.put(x, digit);
            if(x == 'C' || x == 'F' || x == 'I' || x == 'L' || x == 'O' || x == 'S' || x == 'V' || x == 'Z')
                digit += 1;
        }
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String str = sc.nextLine();
            str = str.toUpperCase();
            String strInDigit = "";
            for(int i =0; i <str.length(); i++){
                strInDigit += (char)(map.get(str.charAt(i)) + '0');
            }
            if(checkThuanNghich(strInDigit)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
