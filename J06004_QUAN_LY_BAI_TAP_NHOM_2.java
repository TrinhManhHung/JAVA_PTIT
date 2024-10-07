import java.util.*;

class SinhVien{
    private String id, name, phone;
    private int group;
    //method
    public SinhVien(String id, String name, String phone, int group){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public String getId(){
        return this.id;
    }

    public int getGroup(){
        return this.group;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.phone + " " + this.group + " ";
    }
}

class Subject{
    private int id;
    private String name;
    //method
    public Subject(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.name;
    }
}
public class J06004_QUAN_LY_BAI_TAP_NHOM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        ArrayList<Subject> monHoc = new ArrayList<>();
        for(int i =1; i <=n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(x);
        }

        sc.nextLine();
        for(int i =1; i <=m; i++){
            Subject x = new Subject(i, sc.nextLine());
            monHoc.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                return a.getId().compareTo(b.getId());
            }
        });

        for(SinhVien x : arr){
            System.out.print(x);
            for(Subject y : monHoc){
                if(y.getId() == x.getGroup()){
                    System.out.println(y);
                }
            }
        }
        sc.close();
    }
}

/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
 */