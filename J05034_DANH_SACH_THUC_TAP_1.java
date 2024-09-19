import java.util.*;

class SinhVien {
    private int index;
    private String id, name, className, mail, business;
    //method
    public SinhVien(int index, String id, String name, String className, String mail, String business) {
        this.index = index;
        this.id = id;
        this.name = name;
        this.className = className;
        this.mail = mail;
        this.business = business;
    }

    public String getName() {
        return this.name;
    }
    
    public String getBusiness() {
        return this.business;
    }
    public String toString() {
        return this.index + " " + this.id + " " + this.name + " " + this.className + " " + this.mail + " " + this.business;
    }
}

public class J05034_DANH_SACH_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i =1; i <= n; i++) {
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getName().compareTo(b.getName());
            }
        });

        int query = sc.nextInt();
        sc.nextLine();
        while(query-- > 0) {
            String doanhNghiep = sc.nextLine();
            for(SinhVien x : arr){
                if(x.getBusiness().equals(doanhNghiep))
                    System.out.println(x);
            }
        }
        sc.close();
    }
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT

3 B17DCAT092 Cao Danh Huy D17CQAT04-B test3@stu.ptit.edu.vn FPT
2 B17DCCN107 Dao Thanh Dat D17CNPM5 test2@stu.ptit.edu.vn FPT
5 B17DCCN461 Dinh Quang Nghia D17CNPM2 test5@stu.ptit.edu.vn FPT
 */