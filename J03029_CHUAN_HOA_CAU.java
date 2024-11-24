import java.util.*;

public class J03029_CHUAN_HOA_CAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().toLowerCase().trim().split("\\s+");
            for(int i =0; i <words.length-1; i++){
                if(i == 0){
                    String first = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                    System.out.print(first);
                }
                else{
                    System.out.print(" " + words[i]);
                }
            }
            int len = words.length-1;
            if(words[len].equals(".") || words[len].equals("!") || words[len].equals("?")){
                System.out.println(words[len]);
            }
            else{
                if(!words[len].substring(words[len].length()-1, words[len].length()).equals(".")){
                    System.out.println(" " + words[len] +".");
                }
                else System.out.println(" " + words[len]);
            }
        }
        sc.close();
    }
}
/*
Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
moi    CAC BAN danG ky     thaM giA !
 */