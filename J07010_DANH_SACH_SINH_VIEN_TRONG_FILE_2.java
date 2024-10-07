import java.util.*;
import java.io.*;

class SinhVien{
    private String id, name, className, birth;
    private float gpa;
    //method
    public SinhVien(int id, String name, String className, String birth, float gpa){
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }

    void chuanHoa1(){
        StringBuilder ngaySinh = new StringBuilder(this.birth);
        if(ngaySinh.charAt(2) != '/') ngaySinh.insert(0, "0");
        if(ngaySinh.charAt(5) != '/') ngaySinh.insert(3, "0");
        this.birth = ngaySinh.toString();
    }
    public String toString(){
        chuanHoa1();
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.02f", this.gpa);
    }
}
public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();

        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            arr.add(x);
        }

        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}


/*
 */