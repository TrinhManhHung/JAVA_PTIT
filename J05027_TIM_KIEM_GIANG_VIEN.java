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

    public boolean checkKey(String word) {
        String ten = this.name.toLowerCase();
        word = word.toLowerCase();
        if(ten.contains(word)){
            return true;
        }
        return false;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.getIdSubject();
    }
}

public class J05027_TIM_KIEM_GIANG_VIEN {
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
            String key = sc.nextLine();

            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for(GiangVien x : arr){
                if(x.checkKey(key) == true){
                    System.out.println(x);
                }
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
aN

DANH SACH GIANG VIEN THEO TU KHOA aN:
GV01 Nguyen Manh Son CNPM
GV03 Dang Minh Tuan ATTT
 */