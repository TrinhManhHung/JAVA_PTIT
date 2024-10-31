import java.util.*;

class SinhVien{
    private String id, name, classname, type, hours;
    //method

    public SinhVien(String id, String name, String classname, String type, String hours) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.type = type;
        this.hours = hours;
    }

    public String toString(){
        return this.id + ", " + this.name + ", " + this.classname + ", " + this.type + ", " + this.hours;
    }
}
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        sc.nextLine();
        for(int i =1; i <=n; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        for(SinhVien x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}

/*
2
B19DCCN123
Tran Van An
D19CQCN01-B
Tim hieu dien toan dam may
08:45
B19DCCN987
Hoang Van Binh
D19CQCN02-B
Xay dung game nhap vai
07:30
B19DCCN987, Hoang Van Binh, D19CQCN02-B, Xay dung game nhap vai, 07:30
 */