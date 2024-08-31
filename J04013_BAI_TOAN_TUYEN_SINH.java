import java.util.*;

class SinhVien {
    //Attribute
    private String id;
    private String name;
    private float toan, ly, hoa, diemUuTien;
    private String status;
    //Method
    public SinhVien(String id, String name, float toan, float ly, float hoa){
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void uuTien(){
        String ktra = this.id.substring(0, 3);
        if(ktra.equals("KV1")) diemUuTien = 0.5f;
        else if(ktra.equals("KV2")) diemUuTien = 1;
        else if(ktra.equals("KV3")) diemUuTien = 1.5f;

    }
    public void trangThai(){
        if(toan*2 + ly + hoa + diemUuTien >= 24){
            status = "TRUNG TUYEN";
        }
        else{
            status = "TRUOT";
        }
    }
    public String toString() {
        if(this.diemUuTien % 1 == 0 && (toan*2 + ly + hoa) % 1 == 0){
            return id + " " + name + " " + (int)diemUuTien + " " + (int)(toan*2 + ly + hoa) + " " + status;
        }
        if(this.diemUuTien % 1 != 0 && (toan*2 + ly + hoa) % 1 != 0){
            return id + " " + name + " " + diemUuTien + " " + (toan*2 + ly + hoa) + " " + status;
        }
        if(this.diemUuTien % 1 == 0 && (toan*2 + ly + hoa) % 1 != 0){
            return id + " " + name + " " + (int)diemUuTien + " " + (toan*2 + ly + hoa) + " " + status;
        }
        return id + " " + name + " " + diemUuTien + " " + (int)(toan*2 + ly + hoa) + " " + status;
    }
    
}

public class J04013_BAI_TOAN_TUYEN_SINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        x.uuTien();
        x.trangThai();
        System.out.println(x);
        sc.close();
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
5

KV2B123
Ly Thi Thu Ha
8
6.5
7
 */