import java.util.ArrayList;
import java.util.Scanner;

public class J03017_LOAI_BO_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine().trim();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0; i <s.length(); i++){
                arr.add(i);
                int sz = arr.size();
                if(sz >= 3 && s.charAt(arr.get(sz-3)) == '1' && s.charAt(arr.get(sz-2)) == '0' && s.charAt(arr.get(sz - 1)) == '0'){
                    arr.remove(sz - 1);
                    arr.remove(sz - 2);
                    arr.remove(sz - 3);
                }
            }

            if(arr.size() == 0){
                System.out.println(s.length());
            }
            else{
                int res = 0;
                int idx = arr.size() - 1;
                int end = s.length()-1;

                while(idx >= 0){
                    res = Math.max(res, end - arr.get(idx));
                    end = arr.get(idx) - 1;
                    idx--;
                }
                res = Math.max(res, arr.get(0) - 0);
                System.out.println(res);
            }
        }
        sc.close();
    }
}
/*

 */