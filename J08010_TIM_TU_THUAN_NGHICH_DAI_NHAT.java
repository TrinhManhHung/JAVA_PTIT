import java.util.*;

public class J08010_TIM_TU_THUAN_NGHICH_DAI_NHAT {
    public static boolean checkTN(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int maxLen = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(checkTN(s) && s.length() >= maxLen){
                maxLen = Math.max(maxLen, s.length());
                arr.add(s);
                if(map.containsKey(s)){
                    int tanSuat = map.get(s);
                    map.put(s, tanSuat + 1);
                }
                else{
                    map.put(s, 1);
                }
            }
        }

        for(int i =0; i <arr.size(); i++){
            if(arr.get(i).length() == maxLen && map.get(arr.get(i)) != 0){
                System.out.println(arr.get(i) + " " + map.get(arr.get(i)));
                map.put(arr.get(i), 0);
            }
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