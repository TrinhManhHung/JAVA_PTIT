import java.util.HashSet;
import java.util.Scanner;

public class J03038_DANH_DAU_CHU_CAI {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        HashSet<Character> set = new HashSet<>();
        String str = sc.nextLine();
        for(int i =0; i <str.length(); i++){
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
        sc.close();
    }
}
