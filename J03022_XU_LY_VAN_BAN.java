import java.util.*;

public class J03022_XU_LY_VAN_BAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(sc.next().toLowerCase());
        }
        boolean Upper = true;
        for(int i =0; i <arr.size(); i++){
            if(Upper){
                 arr.set(i, arr.get(i).substring(0, 1).toUpperCase() + arr.get(i).substring(1).toLowerCase());
                if(arr.get(i).substring(arr.get(i).length() -1).equals(".") || arr.get(i).substring(arr.get(i).length() -1).equals("?") || arr.get(i).substring(arr.get(i).length() -1).equals("!")){
                    System.out.println(arr.get(i).substring(0, arr.get(i).length() -1));
                    Upper = true;
                }
                else{
                    System.out.print(arr.get(i) + " ");
                    Upper = false;
                }
            }
            else if(arr.get(i).substring(arr.get(i).length() -1).equals(".") || arr.get(i).substring(arr.get(i).length() -1).equals("?") || arr.get(i).substring(arr.get(i).length() -1).equals("!")){
                System.out.println(arr.get(i).substring(0, arr.get(i).length() -1));
                Upper = true;
            }
            else System.out.print(arr.get(i) + " ");

        }
        sc.close();
    }
}
/*
ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.

Ky thi lap trinh icpc ptit bat dau to chuc tu nam 2010
Nhu vay, nam nay la tron 10 nam
Vay co phai nam nay la ky thi lan thu 10
Khong phai
Nam nay la ky thi lan thu 11

Ky thi lap trinh icpc ptit bat dau to chuc tu nam 2010
Nhu vay, nam nay la tron 10 nam
Vay co phai nam nay la ky thi lan thu 10
Khong phai
Nam nay la ky thi lan thu 11
 */