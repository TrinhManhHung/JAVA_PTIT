import java.io.*;
import java.util.*;

class SinhVien{
    private String id, name, className, birth;
    private double diem;
    //method
    public SinhVien(int id, String name, String className, String birth, double diem){
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.diem =diem;
    }
    public void ChuanHoaTen(){
        String[] words = this.name.toLowerCase().trim().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public void ChuanHoaBirth(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        this.birth = sb.toString();
    }

    public String toString(){
        ChuanHoaTen();
        ChuanHoaBirth();
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.02f", this.diem);
    }
}
public class J07018_CHUAN_HOA_DANH_SACH_SINH_VIEN {
public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}