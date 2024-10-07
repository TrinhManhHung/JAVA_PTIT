import java.util.*;

public class J03020_TIM_TU_THUAN_NGHICH_DAI_NHAT{
    public static boolean checkTN(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int max_len = 0;

        while(sc.hasNext()){
            String word = sc.next();
            if(checkTN(word) && word.length() >= max_len){
                max_len = word.length();
                arr.add(word);
                if(map.containsKey(word)){
                    int tanSuat = map.get(word);
                    map.put(word, tanSuat + 1);
                }
                else{
                    map.put(word, 1);
                }
            }
        }

        for(String x : arr){
            if(x.length() == max_len && map.get(x) != 0)
                System.out.println(x + " " + map.get(x));
                map.put(x, 0);
        }
        sc.close();
    }
}

/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
 */