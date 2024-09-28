import java.util.*;

class Student{
    private String id, name;
    private float mon1, mon2, mon3;
    //method
    public Student(String id, String name, float mon1, float mon2, float mon3){
        this.id = id;
        this.name = name;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public float uuTien(){
        if(this.id.substring(0, 3).equals("KV1")) return 0.5f;
        if(this.id.substring(0, 3).equals("KV2")) return 1f;
        return 2.5f;
    }

    public float tongDiem(){
        return this.mon1 * 2 + this.mon2 + this.mon3;
    }

    public String trangThai(){
        if(tongDiem() + uuTien() >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }

    public String toString(){
        if(uuTien() % 1 == 0 && tongDiem() % 1 == 0)
            return this.id + " " +this.name + " " + (int)this.uuTien() + " " + (int)this.tongDiem() + " " + trangThai();
        if(uuTien() % 1 != 0 && tongDiem() % 1 == 0)
            return this.id + " " +this.name + " " + String.format("%.01f", this.uuTien()) + " " + (int)this.tongDiem() + " " + trangThai();
        if(uuTien() % 1 == 0 && tongDiem() % 1 != 0)
            return this.id + " " +this.name + " " + (int)this.uuTien() + " " + String.format("%.01f", this.tongDiem()) + " " + trangThai();

        return this.id + " " +this.name + " " + String.format("%.01f", this.uuTien()) + " " + String.format("%.01f", this.tongDiem()) + " " + trangThai();    
    }
}

public class J05057_BANG_DIEM_TUYEN_SINH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();

        for(int i  =1; i <=n; i++){
            sc.nextLine();
            Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            arr.add(x);
        }

        for(Student x : arr){
            System.out.println(x);
        }

        sc.close();
    }
}

/*
2
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