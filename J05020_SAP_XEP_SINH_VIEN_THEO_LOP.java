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

    public String toString() {
        return id + " " + name + " " + nameClass + " " + mail;
    }
}

public class J05020_SAP_XEP_SINH_VIEN_THEO_LOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if(a.getNameClass().equals(b.getNameClass())){
                    return a.getId().compareTo(b.getId());
                }
                return a.getNameClass().compareTo(b.getNameClass());
            }
        });

        for(SinhVien x : arr) {
            System.out.println(x);
        }
        sc.close();
    }
}
/*
4
B16DCCN011
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
D15CQKT03-B
sv4@stu.ptit.edu.vn

B15DCCN215 To Ngoc Hieu D15CNPM3 sv2@stu.ptit.edu.vn
B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn
B15DCKT199 Nguyen Trong Tung D15CQKT03-B sv4@stu.ptit.edu.vn
B16DCCN011 Nguyen Trong Duc Anh D16CNPM1 sv1@stu.ptit.edu.vn
 */