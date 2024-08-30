import java.util.Scanner;

public class J03040_BIEN_SO_DEP {
    public static boolean checkTangDan (String number){
        for(int i =1; i <number.length(); i++){
            if(number.charAt(i) <= number.charAt(i-1)) return false;
        }
        return true;
    }
    public static boolean checkLocPhat (String number){
        for(int i =0; i < number.length(); i++){
            if(number.charAt(i) != '6' && number.charAt(i) != '8')
                return false;
        }
        return true;
    }
    public static boolean checkBangNhau (String number){
        if(number.charAt(0) == number.charAt(1) && number.charAt(1) == number.charAt(2) && number.charAt(3) == number.charAt(4)) 
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String bienSo = sc.nextLine();
            String number = "";
            for(int i =bienSo.length() - 6; i < bienSo.length(); i++){
                if(bienSo.charAt(i) >= '0' && bienSo.charAt(i) <= '9'){
                    number += bienSo.charAt(i);
                } 
            }
            if(checkBangNhau(number) || checkLocPhat(number) || checkTangDan(number)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
