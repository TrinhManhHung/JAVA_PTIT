import java.util.*;

class Student{
    private String id, name, birth;
    private float mon1, mon2;
    //method
    public Student(int id, String name, String birth, float mon1, float mon2){
        this.id = "PH" + String.format("%02d", id);
        this.name = name;
        this.birth = birth;
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    public float diemThuong(){
        if(this.mon1 >= 8 && this.mon2 >= 8) return 1f;
        if (this.mon1 >= 7.5 && this.mon2 >= 7.5) {
            return 0.5f;
        }
        return 0;
    }

    public int tongDiem(){
        float diemTrungBinh = (this.mon1 + this.mon2) / 2 + diemThuong();
        if(diemTrungBinh > 10) return 10;
        return (int)(Math.round(diemTrungBinh));
    }

    public int getTuoi(){
        int namSinh = Integer.parseInt(this.birth.substring(6));
        return 2021 - namSinh;
    }

    public String trangThai(){
        if(tongDiem() < 5) return "Truot";
        if(tongDiem() <= 6) return "Trung binh";
        if(tongDiem() == 7) return "Kha";
        if(tongDiem() == 8) return "Gioi";
        return "Xuat sac";
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.getTuoi() + " " + this.tongDiem() + " " + this.trangThai();
    }
}

public class J05060_KET_QUA_XET_TUYEN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();

        for(int i  =1; i <=n; i++){
            sc.nextLine();
            Student x = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
            arr.add(x);
        }

        for(Student x : arr){
            System.out.println(x);
        }

        sc.close();
    }
}

/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9

PH01 Doan Thi Kim 39 10 Xuat sac
PH02 Dinh Thi Ngoc Ha 25 7 Kha
PH03 Tran Thanh Mai 17 10 Xuat sac
 */