import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    private String id, name, position;
    private long daySalary, day;
    //method
    public NhanVien(int id, String name, long daySalary, long day, String position){
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
        this.position = position;
    }

    public long phuCap() {
        if(position.equals("GD")) return 250000;
        if(position.equals("PGD")) return 200000;
        if(position.equals("TP")) return 180000;
        return 150000;
    }

    public long luongThang() {
        return this.day * this.daySalary;
    }

    public long luongThuong() {
        if(this.day >= 25){
            return luongThang() / 5;
        }
        if(this.day >= 22){
            return luongThang() / 10;
        }
        return 0;
    }

    public long thucLinh() {
        return luongThang() + luongThuong() + phuCap();
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.luongThang() + " " + this.luongThuong() + " " + this.phuCap() + " " + this.thucLinh();
    }
}

public class J05040_LAP_BANG_TINH_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            NhanVien x = new NhanVien(i, sc.nextLine(),Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            arr.add(x);
        }

        for(NhanVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
 */