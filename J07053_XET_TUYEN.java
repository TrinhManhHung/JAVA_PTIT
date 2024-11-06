import java.io.*;
import java.util.*;

class ThiSinh{
    private String id, name, birth;
    private double diem1, diem2;
    //method
    public ThiSinh(int id, String name, String birth, double diem1, double diem2){
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    public void ChuanHoaTen(){
        String[] words = this.name.toLowerCase().trim().split("\\s+");
        String ten = "";
        for(int i =0; i <words.length; i++){
            ten += words[i].substring(0, 1).toUpperCase() 
                + words[i].substring(1) + " ";
        }
        this.name = ten.trim();
    }
    public int getTuoi(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.birth = sb.toString();
        int namSinh = Integer.parseInt(this.birth.substring(6));
        return 2021 - namSinh;
    }
    public double getDiemThuong(){
        if(this.diem1 >=8 && this.diem2 >=8) return 1.0;
        if(this.diem1 >=7.5 && this.diem2 >=7.5) return 0.5;
        return 0;
    }
    public int getDiemTB(){
        return (int)Math.round((this.diem1 + this.diem2) / 2 + this.getDiemThuong());
    }
    public String getXepLoai(){
        if(getDiemTB() < 5) return "Truot";
        if(getDiemTB() <= 6) return "Trung binh";
        if(getDiemTB() == 7) return "Kha";
        if(getDiemTB() == 8) return "Gioi";
        return "Xuat sac";
    }
    public String toString(){
        ChuanHoaTen();
        return this.id + " " + this.name + " " + this.getTuoi() + " " + Math.min(10, getDiemTB()) + " " + this.getXepLoai();
    }
}
public class J07053_XET_TUYEN {
public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(x);
        }
        for(ThiSinh x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}