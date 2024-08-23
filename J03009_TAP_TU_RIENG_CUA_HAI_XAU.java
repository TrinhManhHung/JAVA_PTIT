import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            TreeMap<String, Integer> map = new TreeMap<>();
            //Nhập và tách từ
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            String[] arr1 = str1.split("\\s+");
            String[] arr2 = str2.split("\\s+");

            for(int i =0; i <arr1.length; i++){
                if(arr1[i] != " "){
                    map.put(arr1[i], 1);
                }
            }

            for(int i =0; i <arr2.length; i++){
                if(map.containsKey(arr2[i])){
                    map.put(arr2[i], 2);
                }
            }

            Set<Map.Entry<String, Integer>> set = map.entrySet();
            for(Map.Entry<String, Integer> x : set){
                if(x.getValue() == 1){
                    System.out.print(x.getKey() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
