import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class KhachHang{
    private String id, name, sex, birth, addr;
    private static int cnt = 0;
    //method
    public KhachHang(String name, String sex, String birth, String addr){
        cnt++;
        this.id = "KH" + String.format("%03d", cnt);
        this.name = name.trim();
        this.sex = sex.trim();
        this.birth = birth.trim();
        this.addr = addr.trim();
        ChuanHoa1();
        ChuanHoa2();
    }
    public void ChuanHoa1(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public void ChuanHoa2(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }
    public String getYear(){
        return this.birth.substring(6);
    }
    public String getMonth(){
        return this.birth.substring(3, 5);
    }
    public String getDay(){
        return this.birth.substring(0, 2);
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.addr + " " + this.birth;
    }
}
public class J07025_DANH_SACH_KHACH_HANG_TRONG_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACHHANG.in");
        Scanner sc = new Scanner(file); 
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            KhachHang x = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                if(!a.getYear().equals(b.getYear())){
                    return a.getYear().compareTo(b.getYear());
                }
                if(!a.getMonth().equals(b.getMonth())){
                    return a.getMonth().compareTo(b.getMonth());
                }
                return a.getDay().compareTo(b.getDay());
            }
        });
        for(KhachHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
KH002 Tran Van Binh Nam Phung Khoang-Nam Tu Liem-Ha Noi 14/11/1995
KH001 Nguyen Van Nam Nam Mo Lao-Ha Dong-Ha Noi 12/12/1997
KH002 Tran Van Binh Nam Phung Khoang-Nam Tu Liem-Ha Noi 14/11/1995
KH001 Nguyen Van Nam Nam Mo Lao-Ha Dong-Ha Noi 12/12/1997
 */