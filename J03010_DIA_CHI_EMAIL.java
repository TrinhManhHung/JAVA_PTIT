import java.util.HashMap;
import java.util.Scanner;

public class J03010_DIA_CHI_EMAIL {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            //Nhập và tách từ
            String str = sc.nextLine();
            str = " " + str;
            String[] arr = str.split("\\s+");
            //Chuyển về in thường
            for(int i =1; i <arr.length; i++){
                arr[i] = arr[i].toLowerCase();
            }
            //Tạo phần đầu của email
            String headOfEmail = arr[arr.length-1];
            for(int i =1; i <arr.length-1; i++){
                headOfEmail += arr[i].charAt(0);
            }
            //Kiểm tra đã tồn tại email chưa
            if(!map.containsKey(headOfEmail)){
                System.out.println(headOfEmail + "@ptit.edu.vn");
                map.put(headOfEmail, 1);
            }
            else{
                int tanSuat = map.get(headOfEmail);
                tanSuat += 1;
                System.out.println(headOfEmail + tanSuat + "@ptit.edu.vn");
                map.put(headOfEmail, tanSuat);
            }
        }
        sc.close();
    }
}
