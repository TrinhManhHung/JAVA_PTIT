import java.util.*;

class SinhVien {
    private String id, name, birth, className;
    private float gpa;
    private static int soLuong = 0;
    //method
    public SinhVien (){
        this.id = this.name = this.birth = this.className = "";
        this.gpa = 0;
    }
    public SinhVien (String name, String className, String birth, float gpa){
        soLuong++;
        this.id = "B20DCCN" + String.format("%03d", soLuong);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }
    public void chuanHoaBirth (){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.birth = sb.toString();
    }
    public String toString (){
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}

public class J05003_DANH_SACH_DOI_TUONG_SINH_VIEN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            x.chuanHoaBirth();
            arr.add(x);
        }
        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19

B20DCCN001 Nguyen Van An D20CQCN01-B 02/12/2002 3.19
 */