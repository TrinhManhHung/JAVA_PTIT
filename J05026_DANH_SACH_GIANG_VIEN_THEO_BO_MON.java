import java.util.*;

class GiangVien {
    private String id, name, subject;
    //method
    public GiangVien(int id, String name, String subject) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.subject = subject;
    }

    public String getIdSubject() {
        String[] words = this.subject.split(" ");
        
        String ma = "";
        for(String x : words) {
            ma += x.charAt(0);
        }
        ma = ma.toUpperCase();
        return ma;
    }

    public String getName() {
        String[] arr = this.name.split(" ");
        return arr[arr.length - 1];
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.getIdSubject();
    }
}

public class J05026_DANH_SACH_GIANG_VIEN_THEO_BO_MON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> arr = new ArrayList<>();
        
        for(int i =1; i <=n; i++){
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        int query = sc.nextInt();
        sc.nextLine();
        while(query-- > 0){
            String monHoc = sc.nextLine();
            String[] words = monHoc.split(" ");
        
            String ma = "";
            for(String x : words) {
                ma += x.charAt(0);
            }
            ma = ma.toUpperCase();

            System.out.println("DANH SACH GIANG VIEN BO MON " + ma + ":");
            for(GiangVien x : arr){
                if(x.getIdSubject().equals(ma))
                    System.out.println(x);
            }
        }


        sc.close();
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
Cong nghe phan mem

DANH SACH GIANG VIEN BO MON CNPM:
GV01 Nguyen Manh Son CNPM
 */