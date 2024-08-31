import java.util.*;

class NhanVien  {
    //Attribute
    private String id;
    private String name;
    private int salary;
    private int date;
    private String position;
    //Method
    NhanVien (String id, String name, int salary, int date, String position){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.position = position;
    }
    public int luongThang() {
        return salary * date;
    }
    public int luongThuong() {
        if(date >= 25) return luongThang() * 20 / 100;
        if(date >= 22 && date < 25) return luongThang() * 10 / 100;
        return 0;
    }
    public int phuCap() {
        if(this.position.equals("GD")) return 250000;
        if(this.position.equals("PGD")) return 200000;
        if(this.position.equals("TP")) return 180000;
        return 150000;
    }
    public int thuNhap() {
        return luongThang() + luongThuong() + phuCap();
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.luongThang() + " " + this.luongThuong() + " " + this.phuCap() + " " + this.thuNhap();
    }
}

public class J04012_BAI_TOAN_TINH_CONG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int salary = sc.nextInt();
        int date = sc.nextInt();
        sc.nextLine();
        String position = sc.nextLine().trim();
        NhanVien x = new NhanVien ("NV01", name, salary, date, position);
        System.out.println(x);
        sc.close();
    }
}
/*
Bui Thi Trang
45000
23
PGD
 */