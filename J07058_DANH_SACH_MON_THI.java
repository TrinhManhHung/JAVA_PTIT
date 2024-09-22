import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MonHoc {
    private String id, name,format;
    //method

    public MonHoc(String id, String name, String format) {
        this.id = id;
        this.name = name;
        this.format = format;
    }

    public String getId() {
        return this.id;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.format;
    }
}

public class J07058_DANH_SACH_MON_THI{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <MonHoc> arr = new ArrayList<>();
        for(int i =0; i <n; i++){
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc a, MonHoc b) {
                return a.getId().compareTo(b.getId());
            }
        });

        for(MonHoc x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
/*
2
MUL1320
Nhap mon da phuong tien
Bai tap lon + Van dap truc tuyen
BAS1203
Giai tich 1
Thi viet + Van dap truc tuyen

BAS1203 Giai tich 1 Thi viet + Van dap truc tuyen
MUL1320 Nhap mon da phuong tien Bai tap lon + Van dap truc tuyen
 */