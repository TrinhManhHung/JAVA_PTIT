import java.util.*;

class SinhVien {
    private String id, name, nameClass, mail;
    //method
    public SinhVien(String id, String name, String nameClass, String mail) {
        this.id = id;
        this.name = name;
        this.nameClass = nameClass;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public String getNameClass() {
        return nameClass;
    }
    
    public String getYear() {
        return this.nameClass.substring(1, 3);
    }
    public String toString() {
        return id + " " + name + " " + nameClass + " " + mail;
    }
}

public class J05023_LIET_KE_SINH_VIEN_THEO_KHOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        int query = sc.nextInt();
        sc.nextLine();
        while(query-- > 0) {
            String year = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");

            for(SinhVien x : arr){
                if(x.getYear().equals(year.substring(2))){
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}
/*
4
B00DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2000

DANH SACH SINH VIEN KHOA 2015:
B15DCCN215 To Ngoc Hieu D15CNPM3 sv2@stu.ptit.edu.vn
B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn
B15DCKT199 Nguyen Trong Tung D15CQKT02-B sv4@stu.ptit.edu.vn
 */