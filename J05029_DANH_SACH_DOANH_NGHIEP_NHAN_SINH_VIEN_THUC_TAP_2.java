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

public class J05029_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_2 {
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

        int query = sc.nextInt();
        while(query-- > 0) {
            int min = sc.nextInt();
            int max = sc.nextInt();

            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + min + " DEN " + max + " SINH VIEN:");
            for(Business x : arr) {
                if(x.getStudents() >= min && x.getStudents() <= max){
                    System.out.println(x);
                }
            }
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
1
30 50

DANH SACH DOANH NGHIEP NHAN TU 30 DEN 50 SINH VIEN:
SUN SUN* 50
VIETTEL TAP DOAN VIEN THONG QUAN DOI VIETTEL 40
 */