import java.util.*;

class Business{
    private String id, name;
    int students;
    //method
    public Business(String id, String name, int students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }
    public String toString () {
        return this.id + " " + this.name + " " + this.students;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getStudents() {
        return students;
    }
}

public class J05028_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Business> arr = new ArrayList<>();
        for(int i =1; i <=n; i++) {
            sc.nextLine();
            Business x = new Business(sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<Business>(){
            @Override
            public int compare(Business a, Business b) {
                if(a.getStudents() != b.getStudents()){
                    return b.getStudents() - a.getStudents();
                }
                return a.getId().compareTo(b.getId());
            }
        });

        for(Business x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50

FSOFT CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE 300
VNPT TAP DOAN BUU CHINH VIEN THONG VIET NAM 200
SUN SUN* 50
VIETTEL TAP DOAN VIEN THONG QUAN DOI VIETTEL 40
 */