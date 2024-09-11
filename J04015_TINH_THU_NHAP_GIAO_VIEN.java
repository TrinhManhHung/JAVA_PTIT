import java.util.*;

class GiaoVien {
    private String chucVu, name;
    private long bacLuong, phuCap, luongCoBan;
    //method
    public GiaoVien(String chucVu, String name, long luongCoBan) {
        this.chucVu = chucVu;
        this.name = name;
        this.luongCoBan = luongCoBan;
        this.bacLuong = 0;
        this.phuCap = 0;
    }
    public void xuLiLuong() {
        this.bacLuong = Long.parseLong(chucVu.substring(2));
        String type = this.chucVu.substring(0, 2);
        if(type.equals("HT"))
            this.phuCap = 2000000;
        else if(type.equals("HP"))
            this.phuCap = 900000;
        else {
            this.phuCap = 500000;
        }
    }
    public String toString() {
        return this.chucVu + " " + this.name + " " + this.bacLuong + " " + this.phuCap + " " + (this.luongCoBan * this.bacLuong + this.phuCap);
    }
}

public class J04015_TINH_THU_NHAP_GIAO_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien Hung = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        Hung.xuLiLuong();
        System.out.println(Hung);
        sc.close();
    }
}
/*
HP04
Tran Quoc Huy
1578000

HP04 Tran Quoc Huy 4 900000 7212000
 */