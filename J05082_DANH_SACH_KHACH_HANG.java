import java.util.*;

class KhachHang{
    private String id, name, sex, birth, addr;
    //method
    public KhachHang(int id, String name, String sex, String birth, String addr){
        this.id = "KH" + String.format("%03d", id);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.addr = addr;
    }

    public void chuanHoa1(){
        String[] words = this.name.trim().toLowerCase().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1, words[i].length()) + " ";
        }
        this.name = ten.trim();
    }

    public void chuanHoa2(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(this.birth.charAt(2) != '/'){
            sb.insert(0, '0');
        }
        if(this.birth.charAt(5) != '/'){
            sb.insert(3, '0');
        }

        this.birth = sb.toString();
    }

    public String getBirth(){
        return this.birth;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.addr + " " + this.birth;
    }
}   

public class J05082_DANH_SACH_KHACH_HANG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        ArrayList<KhachHang> arr = new ArrayList<>();
        
        for(int i =1; i <=n; i++){
            KhachHang x = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.chuanHoa1(); x.chuanHoa2();
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                String nam_a = a.getBirth().substring(6); String nam_b = b.getBirth().substring(6);
                String thang_a = a.getBirth().substring(3, 5); String thang_b = b.getBirth().substring(3, 5);
                String ngay_a = a.getBirth().substring(0, 2); String ngay_b = b.getBirth().substring(0, 2);
                if(!nam_a.equals(nam_b)){
                    return nam_a.compareTo(nam_b);
                }
                if(!thang_a.equals(thang_b)){
                    return thang_a.compareTo(thang_b);
                }
                return ngay_a.compareTo(ngay_b);   
            }
        });
        for(KhachHang x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
2
 nGuyen VAN     nAm
Nam
15/12/1995
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/12/1995
Phung Khoang-Nam Tu Liem-Ha Noi
 */