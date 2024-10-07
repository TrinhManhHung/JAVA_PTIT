import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class SinhVien{
    private String id, name;
    private double luyenTap, thucHanh, thi;
    //method
    public SinhVien(int id, String name, double luyenTap, double thucHanh, double thi){
        this.id = "SV" + String.format("%02d", id);
        this.name = name;
        this.luyenTap = luyenTap;
        this.thucHanh = thucHanh;
        this.thi = thi;
    }
    public void chuanHoa(){
        String[] words = this.name.trim().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase();
            ten += words[i].substring(1).toLowerCase() + " ";
        }
        this.name = ten.trim();
    }

    public double diemTB(){
        double diem = (this.luyenTap * 25.0 + this.thucHanh * 35.0 + this.thi*40.0) / 100;
        return diem;
    }

    public String xepLoai(){
        if(diemTB() >= 8) return "GIOI";
        if(diemTB() >= 6.5) return "KHA";
        if(diemTB() >= 5) return "TRUNG BINH";
        return "KEM";
    }
    public String toString(){
        this.chuanHoa();
        return this.id + " " + this.name + " " + String.format("%.02f", this.diemTB()) + " " + this.xepLoai();
    }
}

public class J07055_XEP_LOAI {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                if(a.diemTB() > b.diemTB()){
                    return -1;
                }
                return 1;
            }
        });

        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}