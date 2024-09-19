import java.util.*;

class SinhVien {
    private String id, name, className;
    private float diem1, diem2, diem3;
    //method
    public SinhVien(String id, String name, String className, float diem1, float diem2, float diem3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.diem1 + " " + this.diem2 + " " + this.diem3;
    }
}

public class J05030_BANG_DIEM_THANH_PHAN_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        
        for(int i =1; i <=n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getId().compareTo(b.getId());
            }
        });

        for(int i =0; i <n; i++){
            System.out.print((i + 1) + " ");
            System.out.println(arr.get(i));
        }
        sc.close();
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0

1 B20DCAT001 Le Van Nam D20CQAT02-B 6.0 6.0 4.0
2 B20DCCN111 Tran Hoa Binh D20CQCN04-B 9.0 5.0 6.0
3 B20DCCN999 Nguyen Van An D20CQCN04-B 10.0 9.0 8.0
 */