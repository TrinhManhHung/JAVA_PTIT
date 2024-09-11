import java.util.*;

class SinhVien {
    private int id;
    private String name, birth;
    private float mon1, mon2, mon3;
    private static int soLuong = 0;
    //method
    public SinhVien(String name, String birth, float mon1, float mon2, float mon3) {
        soLuong++;
        this.id = soLuong;
        this.name = name;
        this.birth = birth;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    public float getTongDiem() {
        return this.mon1 + this.mon2 + this.mon3;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.birth + " " + (this.mon1 + this.mon2 + this.mon3);
    }
}

public class J05009_TIM_THU_KHOA_CUA_KY_THI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        float diemThuKhoa = 0;
        for(int i =1; i <=n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            arr.add(x);
            diemThuKhoa = Math.max(diemThuKhoa, x.getTongDiem());
        }
        
        for(SinhVien x : arr){
            if(x.getTongDiem() == diemThuKhoa){
                System.out.println(x);
            }
        }
        sc.close();
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5

2 Nguyen Van B 1/9/1994 26.5
3 Nguyen Van C 6/7/1994 26.5
 */