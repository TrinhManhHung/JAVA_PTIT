import java.util.*;

class NhanVien{
    String id, name, pos;
    int luongCoBan, ngayCong;
    //method
    public NhanVien(int id, String name, String position, int luongCoBan, int ngayCong) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name.trim();
        this.pos = position.trim();
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
    }

    public int phuCap() {
        if(pos.equals("GD")){
            return 500;
        }
        if(pos.equals("PGD")){
            return 400;
        }
        if(pos.equals("TP")){
            return 300;
        }
        if(pos.equals("KT")){
            return 250;
        }
        return 100;
    }

    public int tamUng() {
        double tam = this.phuCap() + this.luongCoBan * this.ngayCong;
        if(tam * 2 / 3 < 25000) {
            return (int)Math.round((tam * 2 / 3) / 1000) * 1000;
        }
        return 25000;
    }

    public int conLai() {
        return this.luongCoBan * this.ngayCong + phuCap() - this.tamUng();
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.phuCap() + " " + this.ngayCong * this.luongCoBan + " " + this.tamUng() + " " + conLai();
    }
}

public class J05043_TINH_THU_NHAP_CHO_NHAN_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++) {
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }

        for(NhanVien x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28

NV01 Tran Thi Yen 100 24000 16000 8100
NV02 Nguyen Van Thanh 100 30000 20000 10100
NV03 Doan Truong An 300 75000 25000 50300
NV04 Le Thanh 500 140000 25000 115500
 */