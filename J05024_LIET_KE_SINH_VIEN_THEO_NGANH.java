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
    
    public String getField() {
        String tmp = this.id.substring(3, 7);
        if(tmp.equals("DCKT")){
            return "KE TOAN";
        }
        if(tmp.equals("DCVT")){
            return "VIEN THONG";
        }
        if(tmp.equals("DCDT")){
            return "DIEN TU";
        }
        if(tmp.equals("DCCN") && this.nameClass.charAt(0) != 'E'){
            return "CONG NGHE THONG TIN";
        }
        if(tmp.equals("DCAT") && this.nameClass.charAt(0) != 'E'){
            return "AN TOAN THONG TIN";
        }
        return "";
    }
    public String toString() {
        return id + " " + name + " " + nameClass + " " + mail;
    }
}

public class J05024_LIET_KE_SINH_VIEN_THEO_NGANH {
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
            String field = sc.nextLine();
            field = field.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + field + ":");

            for(SinhVien x : arr){
                if(x.getField().equals(field)){
                    System.out.println(x);
                }
            }
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
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Ke toan

DANH SACH SINH VIEN NGANH KE TOAN:
B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn
B15DCKT199 Nguyen Trong Tung D15CQKT02-B sv4@stu.ptit.edu.vn

 */